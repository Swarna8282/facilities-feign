package com.fedex.moon;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (name="facilities-service")
public interface FeignInterface {
	
	@GetMapping ("/facilities")
	public List<Facility> getAll();

}
