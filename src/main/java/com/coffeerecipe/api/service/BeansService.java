package com.coffeerecipe.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.repository.BeansRepository;

@Service
public class BeansService {
    @Autowired
    BeansRepository repository;
    public List<MBeans> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    public void save(String name, String info,int roast) {
    	
    	var dto = new MBeans();
    	dto.setBEANS_NAME(name);
    	dto.setBEANS_INFO(info);
    	dto.setROAST_VAL(roast);
    	
    	repository.save(dto);
    }
    public void delete(int beansKey) {
    	repository.deleteById(beansKey);
    }
}