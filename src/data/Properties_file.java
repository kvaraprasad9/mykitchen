package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_file {
	static Properties p;
	public static void properties_file() throws IOException{
		FileInputStream fi=new FileInputStream("E://company_workspace//mykitchen//mywebpage.properties");
		p=new Properties();
		p.load(fi);
	}
	
	public static String getdata(String key_val){
		return p.getProperty(key_val);
	}

}
