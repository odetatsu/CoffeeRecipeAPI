package com.coffeerecipe.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MGear;
import com.coffeerecipe.api.repository.GearRepository;
import com.coffeerecipe.api.request.GearInfoReq;

@Service
public class GearService {
    @Autowired
    GearRepository repository;
    public List<MGear> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    
    public MGear search(Integer key) {
        // ユーザーTBLの内容を全検索
        return repository.findById(key).get();
    }
    
    public void delete(Integer id) {
    	
    	var dto = repository.findById(id).get();
       
    	dto.setACTIVE_FLG(0);
    	dto.setDELETE_FLG(1);
    
    	var date = new Date();
    	dto.setUPDATE_DATE(date);

    	repository.save(dto);
    }
    
    public void save(String name, String info) 
    {
    	var item = new MGear();
    
    	item.setGEAR_NAME(name);;
    	item.setGEAR_INFO(info);
    	
    	var date = new Date();
    	item.setCREATE_DATE(date);
    	item.setUPDATE_DATE(date);
    	item.setACTIVE_FLG(1);
    	item.setDELETE_FLG(0);

    	repository.save(item);
    }
    
    
    public void update(GearInfoReq req) 
    {
    	var dto = repository.findById(req.getKey()).get();
    
    	dto.setGEAR_NAME(req.getName());;
    	dto.setGEAR_INFO(req.getInfo());
    	
    	var date = new Date();
    	dto.setUPDATE_DATE(date);

    	repository.save(dto);
    }
}
