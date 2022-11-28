package spring_swagger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeRepository extends JpaRepository<Empolye, Integer> {

}
