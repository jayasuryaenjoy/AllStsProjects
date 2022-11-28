package MultipleTablesConnection.scheduled;

import org.springframework.stereotype.Component;

@Component
public class Scheduled {
	
	@org.springframework.scheduling.annotation.Scheduled(cron="*/10 * * * * *")
	public void getsche() {
		System.out.println("Scheduled");
	}

}
