package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) {
		try {
			// Locate the file
			FileInputStream file = new FileInputStream(new File("studdata.xlsx"));
			// finding the workbook corresponding file
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			// open the sheet
			XSSFSheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) { //traversing each row of the sheet
				for (Cell c : row) {// traversing each cell in the row
					System.out.print("|");
					// for checking the element is numeric,string
					switch (c.getCellType()) {
					case NUMERIC:
						System.out.print(c.getNumericCellValue());// getting the numeric values
						break;
					case STRING:
						System.out.print(c.getStringCellValue());// getting the string values
						break;
					default:
						break;
					}
				}
				System.out.println("" + "|");

			}

			file.close();// close the file
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
