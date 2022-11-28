package MultipleTablesConnection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MultipleTablesConnection.Entity.Professor;
@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
