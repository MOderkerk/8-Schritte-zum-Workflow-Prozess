package de.oderkerk.bpm.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PingWebsiteDelegateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPing() throws IOException {
		PingWebsiteDelegate delegate = new PingWebsiteDelegate();
		assertEquals("Online", delegate.getStatus("https://www.marcooderkerk.de"));
	}
}
