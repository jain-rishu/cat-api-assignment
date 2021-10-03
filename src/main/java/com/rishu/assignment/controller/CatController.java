/**
 * 
 */
package com.rishu.assignment.controller;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishu.assignment.model.CatResult;
import com.rishu.assignment.resthandler.JsonBodyHandler;

/**
 * @author rishu
 *
 */
@RestController
public class CatController {
	
	private String RANDOM_CAT_URL  = "https://api.thecatapi.com/v1/images/search";
	private String API_KEY = "96f398d0-c17a-4fa8-a993-cf4bc8d8b1a9";

	@GetMapping("/cat/random")
	public String getRandom() throws IOException, InterruptedException {
		
		var client = HttpClient.newHttpClient();

		var request = HttpRequest.newBuilder(
		       URI.create(RANDOM_CAT_URL))
		   .header("accept", "application/json")
		   .header("x-api-key", API_KEY)
		   .build();

		
		var response = client.send(request, new JsonBodyHandler<>(CatResult[].class));
		
		String url = response.body().get()[0].url;
		System.out.println(url);
		
		// Response is an <img/> HTML tag that renders the image returned from the CAT API.
		String imgTag = "<img src=\""+url+"\" alt=\"Cat Pic\"/>";
				
		return imgTag;
	}
}
