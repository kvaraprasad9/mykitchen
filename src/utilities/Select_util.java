package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_util {
	
	public static void select(WebElement ele,String text){
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	
	}

}
