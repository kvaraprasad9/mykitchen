package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import data.Properties_file;
import utilities.Buttton_util;
import utilities.Select_util;

public class Registration_module {

	public static void main(String[] args) throws IOException {
		Properties_file.properties_file();
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get(Properties_file.getdata("url"));
		d.findElement(By.id(Properties_file.getdata("fn_id"))).sendKeys("varaprasad");
		d.findElement(By.id(Properties_file.getdata("ln_id"))).sendKeys("kummari");
		d.findElement(By.id(Properties_file.getdata("email_id"))).sendKeys("vara2992@gmail.com");
		d.findElement(By.id(Properties_file.getdata("remail_id"))).sendKeys("vara2992@gmail.com");
		d.findElement(By.id(Properties_file.getdata("newpwd_id"))).sendKeys("vara2999@");
		
		Select_util.select(d.findElement(By.id(Properties_file.getdata("day_id"))), "16");
		Select_util.select(d.findElement(By.id(Properties_file.getdata("month_id"))), "APR");
		Select_util.select(d.findElement(By.id(Properties_file.getdata("year_id"))), "1993");
		
		Buttton_util.radio_button(d, Properties_file.getdata("frb_id"));
		
		d.findElement(By.id(Properties_file.getdata("cb_id"))).click();
		d.findElement(By.id(Properties_file.getdata("signup_id"))).submit();
		
		
	}

}
