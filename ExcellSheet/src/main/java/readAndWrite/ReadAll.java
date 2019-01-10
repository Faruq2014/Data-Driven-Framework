package readAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAll {

	public static void main(String[] args) throws IOException {
		
		
		File src =new File("C://Users//Faruq//Desktop//testdata.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		System.out.println("total row is"+rowcount);
		
		for(int i=0;i<rowcount;i++) {
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("test data is"+data);
			wb.close();
		}
				
		

	}

}
