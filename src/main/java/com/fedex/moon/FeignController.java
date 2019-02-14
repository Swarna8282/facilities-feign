package com.fedex.moon;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeignController {

	@Autowired
	private FeignInterface fint;
	
	@GetMapping ("/")
	public String getAllFacilities (Model mdl) {
		
		List<Facility> fac = fint.getAll();
		
		System.out.println("INSIDE ::: FeignController.getAllFacilities method::: FACILITIES Size = "+ fac.size());
		
		mdl.addAttribute("facilities", fac);
		
		System.out.println("INSIDE ::: FeignController.getAllFacilities method::: ATTRIBUTE SET");
		
		return "facilitiesDisplay";
	}
}
