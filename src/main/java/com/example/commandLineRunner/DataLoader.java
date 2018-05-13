package com.example.commandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.commandLineRunner.Repository.ImageRepository;
import com.example.commandLineRunner.model.Image;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final Logger logger = LoggerFactory.getLogger(DataLoader.class);
	
	@Autowired
	private ImageRepository imageRepository;

	@Override
	public void run(String... args) throws Exception {
		
		for(int i=0 ; i<20 ;i++){
			logger.info("Ramesh Image : "+imageRepository.save(new Image("name"+i)));
		}
		
	}

}
