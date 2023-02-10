package com.coffeerecipe.api.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;

@Service
public class FileUploadService {
	
	private final AmazonS3 s3Client;
	
	public FileUploadService(AmazonS3 s3Client) {
		this.s3Client = s3Client;
	}
	
    public String fileUpload(String s3PathName) 
			       throws IOException{
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String fileName = "image.jpg";
        File uploadFile = new File(fileName);
    
        //try-with-resources
        try (FileOutputStream uploadFileStream = new FileOutputStream(uploadFile)){
    		//byte[] bytes = fileUploadForm.getMultipartFile().getBytes();
	        //uploadFileStream.write(bytes);
        	
        	//引数：S3の格納先オブジェクト名,ファイル名,ファイル
        	s3Client.putObject(s3PathName, fileName, uploadFile);
        	uploadFile.delete();
        	return fileName;
        } catch (AmazonServiceException e) {
        	e.printStackTrace();
        	throw e;
        }  catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        
	}
}