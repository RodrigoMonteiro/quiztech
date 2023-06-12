package com.quiz.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.demo.repository.QuestionRepository;

import jakarta.validation.Valid;

import com.quiz.demo.model.Question;

@Validated
@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<Question> list() {
        return questionRepository.findAll();
    }
     @PostMapping // @ReqestMapping(method = RequestMethod.GET)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Question create(@RequestBody @Valid Question question) {
        return questionRepository.save(question);
    }
}
