package TaskBySrikanth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TaskBySrikanth.Entity.Employee;
import TaskBySrikanth.Service.EmployeeServiceImp;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImp service;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> findAllEmployee(){
		return service.findEmployees();
	}

}
