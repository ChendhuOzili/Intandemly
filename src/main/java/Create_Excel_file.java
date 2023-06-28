
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_Excel_file {

	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		
		Row row1 = sheet.createRow(0); // Row index starts from 0
		Cell cellA1 = row1.createCell(0); // Column index starts from 0
		cellA1.setCellValue("work");

		Row row2 = sheet.createRow(1);
		Cell cellB1 = row2.createCell(1);
		cellB1.setCellValue("Name");
		String filePath = "path/to/save/file.xlsx"
				;
		try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\LENOVO T480\\eclipse-workspace\\new trend.xlsx"))
				{
		    workbook.write(fileOut);
		} catch (IOException e) {
		    e.printStackTrace();
		}

		
		
		

	}

}
