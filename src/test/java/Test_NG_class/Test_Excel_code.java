package Test_NG_class;
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_Excel_code {

	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		
		Row row1 = sheet.createRow(0); // Row index starts from 0
		Cell cellA1 = row1.createCell(0); // Column index starts from 0
		cellA1.setCellValue("Hello");

		Row row2 = sheet.createRow(1);
		Cell cellB = row2.createCell(1);
		cellA1.setCellValue("World");
		//String filePath = "path/to/save/file.xlsx"
				;
		try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\LENOVO T480\\eclipse-workspace\\Test2\\Excel files\\file.xlsx"))
				{
		    workbook.write(fileOut);
		} catch (IOException e) {
		    e.printStackTrace();
		}

		
		
		

	}

}
