package readExcel;

import org.testng.annotations.Test;

import dataprovider.Excelconfig;

public class ReadExcel2 {
	
	@Test
	public void readExcel()
	{
		Excelconfig excel = new Excelconfig();
		
		System.out.println(excel.getStringData("Login",0,0));
		
		System.out.println(excel.getNumericData("Login",0,1));
	}
	

}
