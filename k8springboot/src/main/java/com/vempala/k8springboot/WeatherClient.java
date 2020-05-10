package com.vempala.k8springboot;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "WeatherClient", url = "http://api.openweathermap.org/data/2.5/weather")
public interface WeatherClient {
	@RequestMapping(method = RequestMethod.GET, value="?zip={zip}",produces = "application/json")
	ResponseEntity<Object> getWeather(@PathVariable(value = "zip") String zip, 
			@RequestParam(value = "APPID") String APPID);
}
