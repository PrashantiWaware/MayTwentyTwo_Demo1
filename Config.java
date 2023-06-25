package DemoonExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
	
	public void readExcelsheet() {
		try {
			FileInputStream fis=new FileInputStream("C:\\SeleniumWorkSpace\\ExcelSheets\\Mydata.xlsx");
			
			XSSFWorkbook workbook=new  XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			XSSFRow row=sheet.getRow(1);
			XSSFCell cell=row.getCell(1);
			
			System.out.println(cell.getStringCellValue());
					
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void readAllData() {
		try {
			FileInputStream fis=new FileInputStream("C:\\\\SeleniumWorkSpace\\\\ExcelSheets\\\\Mydata.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowCount=sheet.getLastRowNum();
			
			for(int i=0;i<=rowCount;i++) {
				XSSFRow row=sheet.getRow(i);
				
				int cellCount=row.getLastCellNum();
				
				for(int j=0;j<cellCount;j++) {
					XSSFCell cell=row.getCell(j);
					
					if(j==0 && i==1) {
						System.out.print(cell.getNumericCellValue()+"\t");
					}
					else {
						System.out.print(cell.getStringCellValue()+"\t");
					}
					
				
			}
				System.out.println();
		
		} 
		
	}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
