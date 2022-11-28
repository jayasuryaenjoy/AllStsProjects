package com.example.demo.excel.confe;


import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.demo.entity.Serole;

public class ExcelConf {
	public static void main(String[] args) {
		try {
			Workbook workbook=new XSSFWorkbook();
			Sheet sh= workbook.createSheet("Serole");
			String[] columnHeadings= {"slno","Fristname","Lastname","Email","gender","Team"};
			Font headfont=workbook.createFont();
			headfont.setBold(true);
			headfont.setFontHeightInPoints((short)12);
			headfont.setColor(IndexedColors.BLACK.index);
			CellStyle headerStyle=workbook.createCellStyle();
			headerStyle.setFont(headfont);
			headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			Row headerRow =sh.createRow(0);
			for(int i=0;i<columnHeadings.length;i++) {
				Cell cell=headerRow.createCell(i);
				cell.setCellValue(columnHeadings[i]);
				cell.setCellStyle(headerStyle);
			}
			ArrayList<Serole> a= createData();
			CreationHelper creationhelper= workbook.getCreationHelper();
			int rownum =1;
			for(Serole i:a) {
				Row row=sh.createRow(rownum++);
				row.createCell(0).setCellValue(i.getSlno());
				row.createCell(1).setCellValue(i.getFristname());
				row.createCell(2).setCellValue(i.getLastname());
				row.createCell(3).setCellValue(i.getEmail());
				row.createCell(4).setCellValue(i.getGender());
				row.createCell(5).setCellValue(i.getTeam());
			}
			for(int i=0;i<columnHeadings.length;i++) {
				sh.autoSizeColumn(i);
			}
			Sheet sh2=workbook.createSheet("second");
			FileOutputStream filout= new FileOutputStream("E:surya.xlsx");
			workbook.write(filout);   
			filout.close();
			workbook.close();
			System.out.println("completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static ArrayList<Serole> createData() {
		ArrayList<Serole> a= new ArrayList<Serole>();
		a.add(new Serole(1,"saba","amthul","amthulsaba999@gmail.com","f","java team"));
		a.add(new Serole(2,"Chaitanyamurali Babu"," Nampalli","nampallichaitanyamuralibabu@gmail.com","m","java team"));
		a.add(new Serole(3,"Srikanth","Repala","repalasrikanth@gmail.com","m","java team"));
		a.add(new Serole(4,"navya","Suryadevara","Suryadevaranavya@gmail.com","f","java team"));
		a.add(new Serole(5,"Rachana","nakka","rachananakka@gmail.com","f","java team"));
		a.add(new Serole(6,"mounika","Krishnasagarapu","Krishnasagarapumounika@gmail.com","f","java team"));
		a.add(new Serole(7,"jayasurya","chintada","chintadajayasurya1999@gmail.com","m","java team"));
		return a;
	}
}
