package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buttton_util {
	
	public static void radio_button(WebDriver driver,String id){
		
		WebElement e=driver.findElement(By.id(id));
				
				if(!e.isSelected()){e.click();}
	}

}
