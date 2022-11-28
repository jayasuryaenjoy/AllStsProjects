package TaskBySrikanth.pdf;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

import TaskBySrikanth.Entity.Employee;

public class EmployeePDF {
	
	@Autowired
	List<Employee> employee;
	
	private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(6);
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        cell.setPhrase(new Phrase("id", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("fName", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("lName", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("eMail", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("bloodGroup", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("phoneNumber", font));
        table.addCell(cell);
	}
	private void writeTableData(PdfPTable table) {
        for (Employee e : employee) {
            table.addCell(String.valueOf(e.getId()));
            table.addCell(e.getFName());
            table.addCell(e.getLName());
            table.addCell(e.getEMail());
            table.addCell(String.valueOf(e.getBloodGroup()));
            table.addCell(String.valueOf(e.getPhoneNumber()));
        }
    }
	 public void export(HttpServletResponse response) throws DocumentException, IOException {
	        Document document = new Document(PageSize.A4);
	 }
	 
}
