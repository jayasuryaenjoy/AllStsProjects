package MultipleTablesConnection.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professor {
	@Id
	@GeneratedValue
	int id;
	String fName;
	String cName;
	long fNumber;
	@ManyToOne
	private Student sudent;
}
