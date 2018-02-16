package utility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class ReadProperties
{
   
	String val;

		public String getPropertyValue(String objectName)
	    {
	        
			Properties prop = new Properties();
	        Map<String,String>map = new HashMap<String,String>(); 
	       
	        try
	        {
	            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
	            prop.load(inputStream);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Some issue finding or loading file....!!! " + e.getMessage());

	        }
	        for (final Entry<Object, Object> entry : prop.entrySet()) {
	            map.put((String) entry.getKey(), (String) entry.getValue());
	        }
	     
	       return map.get(objectName);
	        
	    }
	
	
	
	

}
