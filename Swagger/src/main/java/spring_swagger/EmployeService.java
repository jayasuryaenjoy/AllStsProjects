package spring_swagger;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

	@Autowired
	private EmployeRepository employeRepository;

	public List<Empolye> getEmploye() {
		return employeRepository.findAll();
	}

	public Empolye saveEmployee(Empolye employee) {

		return employeRepository.save(employee);
	}
	
	public Optional<Empolye> employeebyId(int id)
	{
		return employeRepository.findById(id);
		
	}
}
