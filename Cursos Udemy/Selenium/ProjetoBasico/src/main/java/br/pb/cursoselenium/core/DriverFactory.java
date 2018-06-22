package br.pb.cursoselenium.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import br.pb.cursoselenium.core.Propriedades.TipoExecucao;

public class DriverFactory {

	/*
	 * Para uso no Maven, houve a descentralização do Driver (a fim de que seja
	 * criada mais de uma thread durante o processamento)
	 */
	// private static WebDriver driver;
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			return initDriver();
		}
	};

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		return threadDriver.get();
	}

	public static WebDriver initDriver() {
		WebDriver driver = null;
		if (Propriedades.TIPO_EXECUCAO == TipoExecucao.LOCAL) {
			switch (Propriedades.BROWSER) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:
				driver = new ChromeDriver();
				break;
			}
		}
		if (Propriedades.TIPO_EXECUCAO == TipoExecucao.GRID) {
			DesiredCapabilities cap = null;
			switch (Propriedades.BROWSER) {
			case FIREFOX:
				cap = DesiredCapabilities.firefox();
				break;
			case CHROME:
				cap = DesiredCapabilities.chrome();
				break;
			}
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.0.13:4444/wd/hub"), cap);
			} catch (MalformedURLException e) {
				System.out.println("Falha na conexão com o GRID");
				e.printStackTrace();
			}
		}
		if (Propriedades.TIPO_EXECUCAO == TipoExecucao.NUVEM) {
			DesiredCapabilities cap = null;
			switch (Propriedades.BROWSER) {
			case FIREFOX:
				cap = DesiredCapabilities.firefox();
				break;
			case CHROME:
				cap = DesiredCapabilities.chrome();
				break;
			case IE:
				ap = DesiredCapabilities.internetExplorer();
				cap.setCapability("platform", "Windows 7");
				cap.setCapability("version", "11.0");
				break;
			}
			try {
				driver = new RemoteWebDriver(new URL("https://ondemand/saucelabs.com:80/wd/hub"), cap);
			} catch (MalformedURLException e) {
				System.out.println("Falha na conexão com o GRID");
				e.printStackTrace();
			}
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void killDriver() {
		WebDriver driver = getDriver();

		if (driver != null) {
			driver.quit();
			driver = null;
		}
		if (threadDriver != null) {
			threadDriver.remove();
		}
	}
}
