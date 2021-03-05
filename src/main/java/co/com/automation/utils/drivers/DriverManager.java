package co.com.automation.utils.drivers;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
	
	private static WindowsDriver<WindowsElement> clientSession = null;
    static Process p;
    
    private DriverManager() {
        throw new IllegalStateException("No se puede establecer el driver");
    }

	public static WindowsDriver<WindowsElement> pruebaCalculadoraWindows() throws MalformedURLException {
	  try {
		  //Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "build.bat"});
		  Process p = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "build.bat"});
	  	//String command = "C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe";//String command = "C:\\Program Files\\WinRAR\\WinRAR.exe";
	  	//ProcessBuilder builder = new ProcessBuilder(command).inheritIO();
	  	//p = builder.start();
	  	DesiredCapabilities capabilities;
	      capabilities = new DesiredCapabilities();
	      capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
	      capabilities.setCapability("deviceName", "WindowsPC");
	      capabilities.setCapability("platformName", "Windows");
	      clientSession = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"), capabilities);
	      clientSession.manage().timeouts().implicitlyWait(68, TimeUnit.SECONDS);
	       
	  } catch (Exception e) {
	  	System.out.println(e.getMessage());
	  }
	  	return clientSession;
	}
}