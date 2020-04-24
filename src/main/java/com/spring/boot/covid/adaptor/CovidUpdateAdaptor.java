package com.spring.boot.covid.adaptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.spring.boot.covid.model.Cases;
import com.spring.boot.covid.model.CovidCaseDTO;
import com.spring.boot.covid.model.Deaths;
import com.spring.boot.covid.model.Tests;

public class CovidUpdateAdaptor {
	
	public List<CovidCaseDTO> finalObject(JSONObject json) {
		
		JSONArray cities = (JSONArray) json.get("response");
		List<CovidCaseDTO> covidList = new ArrayList<CovidCaseDTO>();
	
		@SuppressWarnings("unchecked")
		Iterator<Object> it = cities.iterator();
		while (it.hasNext()) {
			JSONObject obj = (JSONObject) it.next();
			CovidCaseDTO c = new CovidCaseDTO();
			c.setCountry((String) obj.get("country"));
			JSONObject casesJson = (JSONObject) obj.get("cases");
			// System.out.println(casesJson.toString());
			Cases cases = new Cases();
			try {
				cases.setNewCases((String)casesJson.get("new"));
				cases.setActive((Long) casesJson.get("active"));
				cases.setCritical((Long) casesJson.get("critical"));
				cases.setRecovered((Long) casesJson.get("recovered"));
				cases.setTotal((Long) casesJson.get("total"));
				c.setCases(cases);
			} catch (Exception e) {
				e.printStackTrace();
			}
			c.setDay((String) obj.get("day"));
			c.setTime((String) obj.get("time"));

			try {
			Deaths d = new Deaths();
			d.setNewDeaths((String) casesJson.get("new"));
			d.setTotal((Long) casesJson.get("total"));
			c.setDeaths(d);
			}catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Tests t = new Tests();
				t.setTotal((Long) casesJson.get("total"));
				c.setTests(t);
			}catch(Exception e) {
				e.printStackTrace();
			}
			covidList.add(c);
	}
		return covidList;
	}
}
