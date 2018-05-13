package com.example.commandLineRunner.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.commandLineRunner.model.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image,Integer>{

}
