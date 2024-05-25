package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeStandaloneTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//DesiredCapabilities cap=DesiredCapabilities.chrome();
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
