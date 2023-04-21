package com.wordsCount;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.WordCountRestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = WordCountRestController.class)
public class WordsCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordsCountApplication.class, args);
	}

}
