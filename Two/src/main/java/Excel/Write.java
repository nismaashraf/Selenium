package Excel;

import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) {

		// Blank workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Creating a Excel sheet
		XSSFSheet sheet = workbook.createSheet("student Details");
// add data in to sheet
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] { "ID", "NAME", "MARK" });
		data.add(new Object[] { "1", "NISMA", "50" });
		data.add(new Object[] {" 2", "JOHN", "60" });

//intilise the row
		int rownum = 0;

		for (Object[] da : data) {

			// Creating a new row in the sheet
			Row row = sheet.createRow(rownum++);

			int cellnum = 0;

			for (Object value : da) {
//creating a new cell in the sheet
				Cell cell = row.createCell(cellnum++);

				if (value instanceof String)
					cell.setCellValue((String) value);

				else if (value instanceof Integer)
					cell.setCellValue((Integer) value);
			}
		}

		// Try block to check for exceptions
		try {

			// Writing the workbook
			FileOutputStream out = new FileOutputStream("studdata.xlsx");
			workbook.write(out);

			// Closing file output connections
			out.close();

			System.out.println("successfully");
		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}

}
