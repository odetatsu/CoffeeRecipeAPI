package com.coffeerecipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.service.BeansService;

@RestController
public class CoffeeBeansController 
{
		@Autowired
	BeansService service;

	@PostMapping("/coffeebeans")
	public void saveCoffeeBeans(@RequestParam MultiValueMap<String, String> params) {
		var name = params.get("name");
		var info = params.get("info");
		var rostValue = params.get("rostvalue");
        //service.save(name,info,rostValue);
	    
	}
	
	@GetMapping("/coffeebeans")
	public List<MBeans> getCoffeeBeans() {
	    List<MBeans> list = service.searchAll();
	    return list;
	}
}