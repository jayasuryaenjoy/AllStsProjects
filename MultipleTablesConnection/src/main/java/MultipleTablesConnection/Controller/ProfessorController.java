package MultipleTablesConnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import MultipleTablesConnection.Entity.Professor;
import MultipleTablesConnection.Entity.Student;
import MultipleTablesConnection.Service.ProfessorService;

@RestController
public class ProfessorController {
	
	@Autowired
	private ProfessorService professor;
	
	@PostMapping("/IntoDatabaseForProfessor/{id}")
	public String pushprofessor(@RequestBody Professor entity, @PathVariable int id) {
		entity.setSudent(new Student(id, "", "",0, ""));
		professor.insertProfessor(entity);
		return "Data Strode into database";
	}
	@GetMapping("/getprofessor")
	public List<Professor> getprofessor(){
		return professor.getProfessor();
	}
}
