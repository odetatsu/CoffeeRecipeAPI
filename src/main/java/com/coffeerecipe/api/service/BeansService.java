package com.coffeerecipe.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MBeans;
import com.coffeerecipe.api.repository.BeansRepository;
import com.coffeerecipe.api.request.AddBeansInfoReq;
import com.coffeerecipe.api.request.ModBeansInfoReq;

@Service
public class BeansService {
    @Autowired
    BeansRepository repository;
    public List<MBeans> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    public MBeans select(Integer id) {
        // ユーザーTBLの内容を全検索
        return repository.findById(id).get();
    }
    public void save(AddBeansInfoReq addBeans) {
    	var dto = new MBeans();
    	dto.setBEANS_NAME(addBeans.getBeansName());
    	dto.setBEANS_INFO(addBeans.getBeansInfo());
    	dto.setROAST_VAL(addBeans.getRoastVal());
    	dto.setACTIVE_FLG(1);
    	dto.setDELETE_FLG(0);
    	dto.setDISP_ORDER(repository.getMaxOrder()+1);
    	Date date = new Date();
    	dto.setCREATE_DATE(date);
    	dto.setUPDATE_DATE(date);

    	repository.save(dto);
    }
    public void update(ModBeansInfoReq modBeans) {
    	var dto = repository.findById(modBeans.getBeansKey()).get();
    	dto.setBEANS_NAME(modBeans.getBeansName());
    	dto.setBEANS_INFO(modBeans.getBeansInfo());
    	dto.setROAST_VAL(modBeans.getRoastVal());
    	Date date = new Date();
    	dto.setUPDATE_DATE(date);
    	repository.save(dto);
    	
    }
    public void delete(int beansKey) {
    	var dto = repository.findById(beansKey).get();
    	dto.setACTIVE_FLG(0);
    	dto.setDELETE_FLG(1);
    	Date date = new Date();
    	dto.setUPDATE_DATE(date);
    	repository.save(dto);  
    	}
}
