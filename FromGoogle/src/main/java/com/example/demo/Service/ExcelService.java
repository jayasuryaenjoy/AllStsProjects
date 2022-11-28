package com.example.demo.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.ExcelEntity;
import com.example.demo.Helper.ExcelHelper;
import com.example.demo.Repository.ExcelRepository;

@Service
public class ExcelService {
	
	@Autowired
	private ExcelRepository er;

	public void save(MultipartFile file) {
		
		try {
			List<ExcelEntity> list=ExcelHelper.convertExcelToList(file.getInputStream());
			this.er.saveAll(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public List<ExcelEntity> getAll(){
		return this.er.findAll();
	}
}
