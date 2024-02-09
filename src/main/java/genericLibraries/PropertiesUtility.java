package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains all the reusable methods to read from properties file
 */
public class PropertiesUtility {
	private Properties property;
	public void propertiesInit(String filePath) {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method fetches the data from properties file based on the key passed
	 * @param Key
	 * @return
	 */
	public String readFromProperties(String Key) {
		return property.getProperty(Key);
	}

}
