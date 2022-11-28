package TaskBySrikanth.Service;

import java.util.List;

import TaskBySrikanth.Entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee> findEmployees();
}
