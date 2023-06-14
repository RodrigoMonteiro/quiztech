package com.quiz.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.quiz.demo.model.Question;
import com.quiz.demo.repository.QuestionRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean // start server with instances
	CommandLineRunner initdatabase(QuestionRepository questionRepository) {
		return args -> {
			questionRepository.deleteAll();
			QuestionDataInsertion.insertQuestions(questionRepository);

		};
	}
}
