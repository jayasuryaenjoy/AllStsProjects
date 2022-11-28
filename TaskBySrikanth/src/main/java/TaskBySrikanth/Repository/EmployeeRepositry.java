package TaskBySrikanth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TaskBySrikanth.Entity.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {

}
