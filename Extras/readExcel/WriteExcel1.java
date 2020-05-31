package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel1 {
	
	
	
	
			
		
	@Test
		
		public void readExcel() throws Exception 
		{
			File src = new File("./Application_TestData/Appdata.xlsx");
			
				
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			wb.getSheet("Account").getRow(0).createCell(2).setCellValue("PASS");
			
			//FileOutputStream fout=new FileOutputStream(new File("./Application_TestData/Appdata1.xlsx"));
			
			wb.getSheet("Account").getRow(1).createCell(2).setCellValue("11.00");
			
			FileOutputStream fout=new FileOutputStream(new File(src.toString()));
			
			
			
			wb.write(fout);
			wb.close();
			
			
			
			

	}
	}



