package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import data.Properties_file;

public class Login_module {
static WebDriver d;
	public static void login() throws IOException {
		Properties_file.properties_file();
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get(Properties_file.getdata("url"));
		d.findElement(By.id(Properties_file.getdata("id_id"))).sendKeys("vara2992@gmail.com");
		d.findElement(By.id(Properties_file.getdata("pwd_id"))).sendKeys("vara2992@");
		d.findElement(By.id(Properties_file.getdata("login_id"))).submit();
		

	}

}
