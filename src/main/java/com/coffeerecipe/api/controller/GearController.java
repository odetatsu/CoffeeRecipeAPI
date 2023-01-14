package com.coffeerecipe.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.converter.ResuponsConverter;
import com.coffeerecipe.api.request.GearInfoReq;
import com.coffeerecipe.api.resupons.GearInfoRes;
import com.coffeerecipe.api.service.GearService;

@RestController
public class GearController 
{
	@Autowired
	GearService service;

	@GetMapping("/gears")
	public List<GearInfoRes> getCoffeeBeans() {
		var list = service.searchAll();
		var res = new ArrayList<GearInfoRes>();
    
		list.stream().filter(str -> str.getACTIVE_FLG()==1).forEach(s->res.add(ResuponsConverter.Convert(s)));

    
		return res;
	}

	@GetMapping("/gears/{id}")
	public GearInfoRes saveGear(@PathVariable("id") Integer id) {

		var item = service.search(id);
		
		return ResuponsConverter.Convert(item);
	}
	
	@PostMapping("/gears")
	public void saveGear(@RequestBody GearInfoReq req) {

		service.save(req.getName(),req.getInfo());
    
	}
	
	@PutMapping("/gears/{id}")
	public void putCoffeeBeans(@RequestBody GearInfoReq req) {
		service.update(req);

	}

	@DeleteMapping("/gears/{id}")
	public void deleteCoffeeBeans(@PathVariable("id") Integer id) {

		service.delete(id);
	}
}