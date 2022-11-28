package MultipleTablesConnection.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import MultipleTablesConnection.Entity.Professor;
import MultipleTablesConnection.Repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professor;
	
	public List<Professor> getProfessor(){
		return professor.findAll();
	}
	
	public String insertProfessor(Professor entity) {
		professor.save(entity);
		return "In to database";
	}

}
