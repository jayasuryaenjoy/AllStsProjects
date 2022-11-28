package TaskBySrikanth.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TaskBySrikanth.Entity.Employee;
import TaskBySrikanth.Repository.EmployeeRepositry;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepositry repositry;

	@Override
	public Employee saveEmployee(Employee employee) {
		return repositry.save(employee);
	}

	@Override
	public List<Employee> findEmployees() {
		return repositry.findAll();
	}

}
