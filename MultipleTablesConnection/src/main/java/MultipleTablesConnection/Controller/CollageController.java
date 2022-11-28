package MultipleTablesConnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import MultipleTablesConnection.Entity.Collage;
import MultipleTablesConnection.Service.CollageService;

@RestController
public class CollageController {

	@Autowired
	private CollageService collage;
	
	@PostMapping("/IntoDatabaseForCollage")
	public String pushCollage(Collage entity) {
		collage.insertCollage(entity);
		return "Data Strode into database";
	}
	
	@GetMapping("/getCollage")
	public List<Collage> getCollage(){
		return collage.getCollage();
	}
}
