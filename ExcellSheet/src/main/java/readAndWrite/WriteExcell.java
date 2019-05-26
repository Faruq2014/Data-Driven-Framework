package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcell {

	public static void main(String[] args) throws IOException {
		File src =new File("C://Users//Faruq//Desktop//xcell sheet//testdata.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		sheet.getRow(0).createCell(4).setCellValue("pass");
		sheet.getRow(1).createCell(4).setCellValue("fail");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		System.out.println("wrote the data sucessfully");
		wb.close();

	}

}
