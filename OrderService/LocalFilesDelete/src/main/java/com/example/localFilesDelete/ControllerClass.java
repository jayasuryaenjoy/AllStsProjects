package com. example.localFilesDelete;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java. util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerClass {
	 @Autowired
	   RestTemplate restTemplate;

	   @RequestMapping(value = "/template/products")
	   private String restCall() throws IOException {
			URL obj = new URL("http://restapi.adequateshop.com/api/Tourist?page=2");
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();

			String output=null;
			if (responseCode == HttpURLConnection.HTTP_OK) { 
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				output = response.toString();
			} else {
				System.out.println("status not equal to 200");
			}
			return output;

		}
//	   public String getProductList() {
//		   final HttpHeaders headers = new HttpHeaders();
//		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	      final HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);
//	      
//	      return restTemplate.exchange("http://dummy.restapiexample.com/api/v1/employees", HttpMethod.GET, requestEntity, String.class).getBody();
//	   }
	   

}
