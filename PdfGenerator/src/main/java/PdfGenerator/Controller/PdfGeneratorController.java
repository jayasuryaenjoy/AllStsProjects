package PdfGenerator.Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.lowagie.text.DocumentException;

import PdfGenerator.Service.PdfGeneratorService;

@RestController
public class PdfGeneratorController {
	
	@Autowired
	private PdfGeneratorService service;
	
	
	@GetMapping("/getPdf")
	public void generatePDF(HttpServletResponse responce) throws DocumentException, IOException {
		responce.setContentType("application/pdf");
		SimpleDateFormat d =new SimpleDateFormat("yyyy-mm-dd");
		String currentdate=d.format(new Date());
		 String hk="Content-Disposition";
		 String hv="attachment;	filename=Pdf_"+currentdate+".pdf";
		 responce.setHeader(hk, hv);
		 this.service.export(responce);
	}
	
}
