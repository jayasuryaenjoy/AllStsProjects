package com.example.demo.Controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.Entity.ExcelEntity;
import com.example.demo.Helper.ExcelHelper;
import com.example.demo.Service.ExcelService;

@RestController

public class ExcelController {

	@Autowired
	ExcelService service;

	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
		if (ExcelHelper.checkExcelFormate(file))
		{

			this.service.save(file);
			return ResponseEntity.ok(Map.of("massage", "File is uploaded and data save to db"));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file");
	}
	@GetMapping("/getAll")
	public List<ExcelEntity> getAll(){
		return this.service.getAll();	
	}
}
