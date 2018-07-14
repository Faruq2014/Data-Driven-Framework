package FaruqAcademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
XSSFWorkbook wb;
XSSFSheet sheet;
public ExcelDataConfig(String excelpath) {
	try {
		File src =new File(excelpath);
		FileInputStream fis= new FileInputStream(src);

		wb= new XSSFWorkbook(fis);
	}catch(Exception e){System.out.println(e.getMessage());}
}
public String getData(int sheetnum, int row, int column) {
	sheet=wb.getSheetAt(sheetnum);
	String data=sheet.getRow(row).getCell(column).getStringCellValue();
	return data;
	
}




}
