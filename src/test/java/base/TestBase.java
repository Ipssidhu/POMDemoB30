package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public static WebDriver driver;
	
	public static Properties prop;
	
	// resultPage
	public TestBase() {
	  String path = System.getProperty("user.dir")+
			  "//src//test//resources//configfiles//config.properties";
	  prop = new Properties();
	  FileInputStream fin;
	try {
		fin = new FileInputStream(path);
		prop.load(fin);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void intialize() {
	String strBrowser = prop.getProperty("broswer");
	  if(strBrowser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else  if(strBrowser.equalsIgnoreCase("edge")) {
		  driver = new EdgeDriver();
	  }
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
}