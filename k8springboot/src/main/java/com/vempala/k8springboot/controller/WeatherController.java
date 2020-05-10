package com.vempala.k8springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vempala.k8springboot.WeatherClient;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Value("${apikey}")
	private String appcode;
	@Autowired
	private WeatherClient weatherClient;
	@GetMapping()
	public ResponseEntity<Object> getWeather(@RequestParam(value = "zip") String zip) {
		return weatherClient.getWeather(zip,appcode);
	}

}
