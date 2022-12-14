package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelReadDataApplication extends ExcelApplication {
	private static final String name="E:surya.xlsx";

	public static void main(String[] args) {
		SpringApplication.run(ExcelReadDataApplication.class, args);
		
		try {
			FileInputStream file = new FileInputStream(new File(name));
			Workbook workbook = new XSSFWorkbook(file);
			DataFormatter dataformatter = new DataFormatter();
			Iterator<Sheet> sheets= workbook.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh=sheets.next();
				System.out.println("Sheet name is:"+sh.getSheetName());
				Iterator<Row> iterator=sh.iterator();
				while(iterator.hasNext()) {
					Row row=iterator.next();
					Iterator<Cell> celliterator= row.iterator();
					while(celliterator.hasNext()) {
						Cell cell=celliterator.next();
						String cellValue=dataformatter.formatCellValue(cell);
						System.out.print(cellValue+"\t");
						
					}
					System.out.println();
				}
			}
			workbook.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
