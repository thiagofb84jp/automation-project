package br.pb.cursoselenium.core;

import static br.pb.cursoselenium.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTest {

	@After
	public void finaliza() {
		killDriver();
	}

}
