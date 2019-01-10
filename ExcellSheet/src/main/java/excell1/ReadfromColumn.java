package excell1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadfromColumn {

	public static void main(String[] args) throws IOException {
		File src = new File("C://Users//Faruq//Desktop//testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		
		System.out.println("toatal row of the sheet is"+rowcount);
		//int colum=sheet.getLeftCol();
	
		//System.out.println("left column number is "+colum);
		for(int i=0; i<rowcount;i++){
			String data=sheet.getRow(i).getCell(0).getStringCellValue();
			String data1=sheet.getRow(i).getCell(1).getStringCellValue();
			String data2=sheet.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println("column name is"+i+"and information is  "+data);
			
			System.out.println("column name is"+i+"and information is  "+data1);
			
			System.out.println("column name is"+i+"and information is  "+data2);
		}
		System.out.println("-----------------------");
	}

}
