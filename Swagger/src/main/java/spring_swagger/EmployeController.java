package spring_swagger;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeController {

	@Autowired
	private EmployeService employeService;

	@GetMapping("/getemployee")
	public List<Empolye> getEmployee() {
		return employeService.getEmploye();
	}
	@PostMapping("/addemployee")
	public Empolye saveemployee(@RequestBody Empolye employee) {
		return employeService.saveEmployee(employee);
	}
	@GetMapping("/get/{id}")
	public Optional<Empolye> countrybyId(@PathVariable("id") int id) {
		return employeService.employeebyId(id);
	}
}
