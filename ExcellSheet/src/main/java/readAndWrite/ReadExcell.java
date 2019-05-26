package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {

	public static void main(String[] args) throws IOException {
		File src =new File("C://Users//Faruq//Desktop//xcell sheet//testdata.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		String data=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		wb.close();

	}

}
