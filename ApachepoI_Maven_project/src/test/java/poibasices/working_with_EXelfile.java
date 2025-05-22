package poibasices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class working_with_EXelfile {
	@Test
public void demo() throws EncryptedDocumentException, IOException {
	String path = "./Test_data/DWS_Testdata.xlsx";
	FileInputStream fis=new FileInputStream(new String(path));
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Names");
	
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	int colocount=sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=0;i<=rowcount-1;i++) {
		for(int j=0;j<=colocount-1; j++) {
			System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
		}
		System.out.println();
	}
	
}
}
