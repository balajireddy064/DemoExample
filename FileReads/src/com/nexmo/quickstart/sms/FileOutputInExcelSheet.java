package com.nexmo.quickstart.sms;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.FileStore;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOutputInExcelSheet {

	public static void main(String[] args) {
		
		FileOutputInExcelSheet e=new FileOutputInExcelSheet();
		FileOutputInExcelSheet a=new FileOutputInExcelSheet();
		System.out.println(a instanceof FileOutputInExcelSheet);

//		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet();
//
//		Map<String, Object[]> map = new TreeMap<String, Object[]>();
//
//		map.put("1", new Object[] { "ID", "NAME", "LASTNAME" });
//		map.put("2", new Object[] { 1, "amit", "shukla" });
//		map.put("3", new Object[] { 2, "lokesh", "gupta" });
//		map.put("4", new Object[] { 3, "john", "adward" });
//		map.put("4", new Object[] { 4, "brain", "scottlan" });
//
//		Set<String> set = map.keySet();
//		int rowNum = 0;
//		for (String Key : set) {
//			Row row = sheet.createRow(rowNum++);
//			Object[] objArr = map.get(Key);
//			int cellnum = 0;
//			for (Object obj : objArr) {
//				Cell cell = row.createCell(cellnum++);
//				if (obj instanceof String)
//					cell.setCellValue((String) obj);
//				else if (obj instanceof Integer)
//					cell.setCellValue((Integer) obj);
//			}
//		}
//		try {
//			// Write the workbook in file system
//			FileOutputStream out = new FileOutputStream(new File("abc.xlsx"));
//			workbook.write(out);
//			out.close();
//			System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
