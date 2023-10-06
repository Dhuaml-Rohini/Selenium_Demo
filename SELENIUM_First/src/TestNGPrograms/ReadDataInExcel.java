package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataInExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("studentinfo");
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		wb.close();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		wb.write(fos);
		

	}

}
