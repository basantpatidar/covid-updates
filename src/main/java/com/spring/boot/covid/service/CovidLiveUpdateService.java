package com.spring.boot.covid.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.covid.adaptor.CovidUpdateAdaptor;
import com.spring.boot.covid.model.CovidCaseDTO;

//import okhttp3.Headers;
//import okhttp3.OkHttpClient;

//import okhttp3.Response;

public class CovidLiveUpdateService {
	public static String getAllUpdate() {
		RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = "https://covid-193.p.rapidapi.com/statistics";
		HttpHeaders headers = new HttpHeaders();
		headers.add("x-rapidapi-host", "covid-193.p.rapidapi.com");
		headers.add("x-rapidapi-key", "fb0ecec32emshbf7d77bcaab1356p11cce2jsn59ec32abff77");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		URI uri = null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		String finalResult = result.getBody();
		JSONParser parser = new JSONParser();
		JSONObject json = null;
		try {
			json = (JSONObject) parser.parse(finalResult);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CovidUpdateAdaptor covidUpdateAdaptor = new CovidUpdateAdaptor();
		 List<CovidCaseDTO> covidList = covidUpdateAdaptor.finalObject(json);
		

		System.out.println(covidList.toString());
		
		return finalResult.toString();
	}
	}


