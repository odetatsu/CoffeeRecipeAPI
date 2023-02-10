package com.coffeerecipe.api.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.service.FileUploadService;

@RestController
public class ImageFileController 
{
	
	private final FileUploadService fileUploadService;
	
	public ImageFileController(	FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}
   
	
	@GetMapping("/file")
	public void PostBrew() throws IOException {
		String s3Path = "brew-images-bucket/" + "sample";
		fileUploadService.fileUpload(s3Path);

	}
}