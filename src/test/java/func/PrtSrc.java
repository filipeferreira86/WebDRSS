package func;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PrtSrc {

	public static byte[] capturar(WebDriver driver) throws InterruptedException {
		Thread.sleep(1500);
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);

		return source;
	}

}
