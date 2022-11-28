package MultipleTablesConnection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MultipleTablesConnection.Entity.Collage;
import MultipleTablesConnection.Repository.CollageRepository;

@Service
public class CollageService {
	
	@Autowired
	private CollageRepository collage;
	
	public List<Collage> getCollage(){
		return collage.findAll();	
	}

	public String insertCollage(Collage entity) {
		collage.save(entity);
		return "In to database";
	}

}
