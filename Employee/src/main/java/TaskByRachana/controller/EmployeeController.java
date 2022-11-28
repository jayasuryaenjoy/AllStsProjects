package TaskByRachana.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Student;

@RestController
public class EmployeeController {

	@Autowired
	RestTemplate template;
	@PostMapping("/enterstudentdetails")
    public String enterStudentDetails(@RequestBody Student studentEnity){
        HttpHeaders header=new HttpHeaders();
        header.setAccept(List.of());
        HttpEntity<Student>entity=new HttpEntity<Student>(studentEnity,header);
        ResponseEntity<String> responseEntity=template.exchange("http://localhost:8080/addstudent",
                HttpMethod.POST,entity,String.class);
    return responseEntity.getBody();
    }
	@GetMapping("/GetStudentDetails")
	public String getStudentDetails() {
		HttpHeaders header=new HttpHeaders();
		HttpEntity<Student> entity=new HttpEntity<Student>(header);
		ResponseEntity<String> responseEntity=template.exchange("http://localhost:8080/getall", HttpMethod.GET,entity,String.class);
				return responseEntity.getBody();
	}
}
