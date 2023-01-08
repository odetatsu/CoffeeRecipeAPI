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
import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.request.AddBeansInfoReq;
import com.coffeerecipe.api.request.ModBeansInfoReq;
import com.coffeerecipe.api.resupons.BeansInfoRes;
import com.coffeerecipe.api.resupons.ModBeansInfoRes;
import com.coffeerecipe.api.service.BeansService;

@RestController
public class CoffeeBeansController 
{
		@Autowired
	BeansService service;

	@PostMapping("/beans")
	public void saveCoffeeBeans(@RequestBody AddBeansInfoReq addBeans) {

        service.save(addBeans);
	    
	}
	
	@GetMapping("/beans")
	public List<BeansInfoRes> getCoffeeBeans() {
	    List<MBeans> list = service.searchAll();
	    List<BeansInfoRes> res = new ArrayList<BeansInfoRes>();
	    
	    list.stream().filter(str -> str.getACTIVE_FLG()==1).forEach(s->res.add(ResuponsConverter.Convert(s)));

	    
	    return res;
	}
	
	@GetMapping("/beans/{id}")
	public ModBeansInfoRes getCoffeeBeans(@PathVariable("id") Integer id) {
	    List<MBeans> list = service.searchAll();
	    List<BeansInfoRes> res = new ArrayList<BeansInfoRes>();
	    
	    list.forEach(s->res.add(ResuponsConverter.Convert(s)));

	    var mBeans = service.select(id);
	    return ResuponsConverter.ConvertModBeansInfo(mBeans);
	}
	
	@PutMapping("/beans/{id}")
	public void putCoffeeBeans(@RequestBody ModBeansInfoReq modBeans) {
	    service.update(modBeans);

	}
	
	@DeleteMapping("/beans/{id}")
	public void deleteCoffeeBeans(@PathVariable("id") Integer id) {

	    service.delete(id);
	}
}