package one;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("E://company_workspace//mykitchen//mywebpage.properties");
		Properties p=new Properties();
		p.load(fi);
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get(p.getProperty("url", "file:///C:/Users/user/Desktop/WebPage/Page.html"));
		d.close();

	}

}
