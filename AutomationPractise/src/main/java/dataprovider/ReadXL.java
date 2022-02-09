package dataprovider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {
	public static String[][] readData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./snapShot/Excel/"+fileName+".xlsx");
	
	XSSFSheet ws= wb.getSheet("sheet1");
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		
		
		int lastCellNum = ws.getRow(0).getLastCellNum();

		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		wb.close();
	return data;
	}

}
