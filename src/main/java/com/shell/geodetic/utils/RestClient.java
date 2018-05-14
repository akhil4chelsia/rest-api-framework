package com.shell.geodetic.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {

	@Autowired
	private RestTemplate restTemplate;	
	
	public void post(String URL, Object object) {		  
		
		System.out.println(URL);
		
		/* SuccessResponse<?> response = null;
		 ResponseEntity<T> res =  restTemplate.postForEntity(URL, request, type);
		 if(res.getStatusCode()==HttpStatus.OK) {
			 response = new SuccessResponse<>(HttpStatus.OK);
			 response.setData(res.getBody());
		 }
		 else {
			 throw new RestClientException(res.getStatusCodeValue(), res.getBody().toString());
		 }
		return (GenericResponse<T>) response;	*/	
		
		return ;
	}
}
