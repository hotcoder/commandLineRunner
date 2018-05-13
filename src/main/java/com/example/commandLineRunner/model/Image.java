package com.example.commandLineRunner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Image {
	@Id @GeneratedValue
	private int id;

	private String name;

	public Image(String name) {
		this.name = name;
	}

}
