package MultipleTablesConnection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MultipleTablesConnection.Entity.Collage;
@Repository
public interface CollageRepository extends JpaRepository<Collage, Integer>{

}
