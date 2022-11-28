package spring_swagger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Swagger")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empolye {

	@Id
	int eid;
	String ename;
	String dept;
	String city;
}
