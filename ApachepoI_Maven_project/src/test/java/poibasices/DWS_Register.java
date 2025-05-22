package poibasices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS_Register {
@DataProvider(name="registerTestdata")
public Object[][] demo() throws EncryptedDocumentException, IOException {
	String path = "./Test_data/DWS_Testdata.xlsx";
	FileInputStream fis=new FileInputStream(new String(path));
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Names");
	int rowcount=sheet.getPhysicalNumberOfRows();
	
	int colocount=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[rowcount-1][colocount];
	for(int i=1;i<rowcount;i++) {
		for(int j=0; j<colocount-1; j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j);
		}
	}
	return data;
}
@Test(dataProvider="registerTestdata")
public void demo1(String Username,String FirstName,String LastName ,String EmailAddress ,String phonenumber,
 String password, String conformpassword, String DeliveryAdress)
  {
	
}
}
