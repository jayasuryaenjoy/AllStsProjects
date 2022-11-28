package PdfGenerator.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfGeneratorService 
{
	public void export(HttpServletResponse responce) throws DocumentException, IOException {
		Document d= new Document(PageSize.A4); 
		PdfWriter.getInstance(d, responce.getOutputStream());
		d.open();
		Paragraph p=new Paragraph("This is the main:");
		d.add(p);
		d.close();
	}

}
