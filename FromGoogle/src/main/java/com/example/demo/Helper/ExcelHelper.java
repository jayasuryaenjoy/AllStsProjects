package com.example.demo.Helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.ExcelEntity;

public class ExcelHelper {

	public static boolean checkExcelFormate(MultipartFile file) {
		String contenttype = file.getContentType();
		if (contenttype.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		} else {
			return false;
		}

	}

	public static List<ExcelEntity> convertExcelToList(InputStream is) {

		List<ExcelEntity> list = new ArrayList<>();
		try {

			Workbook workbook = new XSSFWorkbook(is);
			Sheet data = workbook.getSheet("serole");
			int rownumber = 0;
			Iterator<Row> iterator = data.iterator();
			while (iterator.hasNext()) {
				Row row = iterator.next();
				if (rownumber == 0) {
					rownumber++;
					continue;
				}
				Iterator<Cell> cells = row.iterator();
				int cid = 0;
				ExcelEntity ee = new ExcelEntity();
				while (cells.hasNext()) {
					Cell cell = cells.next();
					switch (cid) {
					case 0:
						ee.setSlno((int) cell.getNumericCellValue());
						break;
					case 1:
						ee.setFristname(cell.getStringCellValue());
						break;
					case 2:
						ee.setLastname(cell.getStringCellValue());
						break;
					case 3:
						ee.setEmail(cell.getStringCellValue());
						break;
					case 4:
						ee.setGender(cell.getStringCellValue());
						break;
					case 5:
						ee.setTeam(cell.getStringCellValue());
						break;
					default:
						break;

					}
				
					cid++;
				}
				list.add(ee);
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
}
