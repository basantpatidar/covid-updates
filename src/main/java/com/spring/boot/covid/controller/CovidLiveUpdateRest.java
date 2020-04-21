package com.spring.boot.covid.controller;

import javax.inject.Singleton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.covid.service.CovidLiveUpdateService;

@Singleton
@RestController
public class CovidLiveUpdateRest {
	
	@RequestMapping(value="/object", method = RequestMethod.GET)
	public String getObject() {
//		Object obj = 
		String res	=	CovidLiveUpdateService.getAllUpdate();
		return res;
	}

}
