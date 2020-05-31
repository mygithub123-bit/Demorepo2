package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class ReadExcelFiles {
	
	@Test
	
	public void readExcel() throws Exception 
	{
		File src = new File("./Application_TestData/Appdata.xlsx");
		
		//File src = new File("C://Users//mdonagapura//Desktop//spring-tool-suite-3.9.6.RELEASE-e4.9.0-win32-x86_64//sts-bundle//sts-3.9.6.RELEASE//Automation1//com.wifispark.framework//Application_Testdata/Appdata.xlsx");
		
		//File src = new File("C:\\Users\\mdonagapura\\Desktop\\data\\Appdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		System.out.println("excel is loaded");
		
		String data1=wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data1);
		
		/*XSSFSheet sh1= wb.getSheetAt(0);
		
		XSSFRow r1=sh1.getRow(0);
		
		XSSFCell c1=r1.getCell(0);
		
	String data1=c1.getStringCellValue();
	
	System.out.println("data from excel is "+data1);*/
		
	}

}
