package utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelInputFile {

	public static void main(String[] args) {
		
		// Save user info in excel file
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("First name");
		cell = row.createCell(1);
		cell.setCellValue("Last name");
		cell = row.createCell(2);
		cell.setCellValue("Email");
		cell = row.createCell(3);
		cell.setCellValue("Password");
		cell = row.createCell(4);
		cell.setCellValue("Address");
		cell = row.createCell(5);
		cell.setCellValue("City");
		cell = row.createCell(6);
		cell.setCellValue("State xpath");
		cell = row.createCell(7);
		cell.setCellValue("Zip Code");
		cell = row.createCell(8);
		cell.setCellValue("Phone");
		cell = row.createCell(9);
		cell.setCellValue("Alias");
		int br = 0;
		for (int i = 1;i<UserInfo.nameSize()/2; i++) {
			
			row = sheet.createRow(i);
			for (int j = 0;j<2; j++) {
				cell = row.createCell(j);
				cell.setCellValue(UserInfo.getNames(br));
				br ++;
			}
			cell = row.createCell(2);
			cell.setCellValue(UserInfo.emailGenerator(br-2));
			cell = row.createCell(3);
			cell.setCellValue(UserInfo.passwordGenerator(br-2));
			cell = row.createCell(4);
			cell.setCellValue(UserInfo.adressGenerator());
			cell = row.createCell(5);
			cell.setCellValue(UserInfo.citieGenerator());
			cell = row.createCell(6);
			cell.setCellValue(UserInfo.countryGenerator());
			cell = row.createCell(7);
			cell.setCellValue(UserInfo.zipCodeGenerator());
			cell = row.createCell(8);
			cell.setCellValue(UserInfo.phoneNumGenerator());
			cell = row.createCell(9);
			cell.setCellValue(UserInfo.aliasGenerator());
			
			
			
			
		}
		
		

		FileOutputStream os;
		try {
			os = new FileOutputStream("Info.xls");
			wb.write(os);
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Gotovo");

	}

}
