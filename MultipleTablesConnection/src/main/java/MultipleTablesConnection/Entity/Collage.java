package MultipleTablesConnection.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Collage {
	@Id
	@GeneratedValue
	int cId;
	String cName;
	int noOfFact;
	int noOfDepts;
	long phoneNumber;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Professor professor;

}
