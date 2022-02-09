package dataprovider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	
	
	public static void main(String[] args) throws IOException {
		
		//Step1: Locate the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./snapShot/Excel/CreateLead.xlsx");
	
	//Step2:Get into the WorkSheet
		XSSFSheet ws = wb.getSheet("sheet1");
		wb.getSheetAt(0);
		
		//Step3:get into the row
		XSSFRow row = ws.getRow(2);
		
		//Step4:get into the column
		XSSFCell cell = row.getCell(2);
		
		//Step5:To read the date
		
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	//Last Step close the work book
		
		wb.close();
	}
}
