package MultipleTablesConnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import MultipleTablesConnection.Entity.Student;
import MultipleTablesConnection.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/IntoDatabaseForStudent")
	public String pushStudent(@RequestBody Student student) {
		service.insertStudent(student);
		return "Data Strode into database";
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudent(){
		return service.getStudent();
	}

}
