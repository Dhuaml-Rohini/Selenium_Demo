package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("studentinfo");
		Row row=sheet.createRow(4);
		org.apache.poi.ss.usermodel.Cell cell=row.createCell(2);
		cell.setCellValue("pune");
		//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		//wb.close();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
		}
        
	}


