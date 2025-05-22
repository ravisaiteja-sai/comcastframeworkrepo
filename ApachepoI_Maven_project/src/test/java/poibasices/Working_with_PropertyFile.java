package poibasices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_PropertyFile {
@Test
public void demo() throws IOException {
	String path="./Test_configuration/TestConfiguration.properties";
	FileInputStream fis=new FileInputStream(new String(path));
	Properties prop=new Properties();
	prop.load(fis);
	driver.findElemt(By.id("FitstName").sendkeys( prop.getProperty("FirstName"));
	String lname = prop.getProperty("LastName");
	String company = prop.getProperty("Company");
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(company);
	
}
}
