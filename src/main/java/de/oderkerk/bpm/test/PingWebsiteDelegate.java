package de.oderkerk.bpm.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PingWebsiteDelegate implements JavaDelegate {

	private final static Logger LOGGER = LoggerFactory.getLogger(PingWebsiteDelegate.class);

	public void execute(DelegateExecution execution) throws Exception {
		if (LOGGER.isDebugEnabled())
			LOGGER.debug("Starting execute Delegate PingWebsiteDelegate ");
		execution.setVariable("stateOfPingResult", getStatus("https://www.marcooderkerk.de"));

	}

	public String getStatus(String url) throws IOException {

		String result = "";
		try {
			URL urlObj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
			con.setRequestMethod("GET");
			// Set connection timeout
			con.setConnectTimeout(3000);
			con.connect();

			int code = con.getResponseCode();
			if (code == 200) {
				result = "Online";
			}
		} catch (Exception e) {
			result = "Offline";
		}
		return result;
	}

}
