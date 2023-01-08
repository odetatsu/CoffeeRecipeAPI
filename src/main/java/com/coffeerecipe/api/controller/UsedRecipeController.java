package com.coffeerecipe.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.service.BeansService;

@RestController
public class UsedRecipeController 
{
    @Autowired
	BeansService service;
    
    

}