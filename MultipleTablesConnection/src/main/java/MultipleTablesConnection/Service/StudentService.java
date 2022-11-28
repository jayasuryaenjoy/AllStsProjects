package MultipleTablesConnection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MultipleTablesConnection.Entity.Student;
import MultipleTablesConnection.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public List<Student> getStudent() {
		return repository.findAll();
	}
	public String insertStudent(Student student) {
		repository.save(student);
		return "Into database";
	}

}
