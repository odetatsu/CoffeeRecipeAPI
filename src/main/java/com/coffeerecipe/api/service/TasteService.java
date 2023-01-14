package com.coffeerecipe.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.repository.TasteRepository;

@Service
public class TasteService {
    @Autowired
    TasteRepository repository;
    public List<MTaste> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    
    
    public List<MTaste> select(int recipeKey) 
    {
       // ユーザーTBLの内容を全検索
        return repository.findByRecipeKey(recipeKey);
    }
    
    public void delete(int recipeKey) {
    	repository.deleteById(recipeKey);
    }
    
    public void save(int recipeKey, int bitter, int acidity, int rich, String remarks) 
    {
    	var item = new MTaste();
    	item.setRECIPE_KEY(recipeKey);
    	item.setBITTER(bitter);
    	item.setACIDITY(acidity);
    	item.setRICH(rich);
    	item.setREMARKS(remarks);

    	repository.save(item);
    }
}
