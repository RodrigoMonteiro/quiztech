package com.quiz.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.demo.repository.QuestionRepository;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

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

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable @Positive Long id) {
        return questionRepository.findById(id);

    }

    @PostMapping 
    @ResponseStatus(code = HttpStatus.CREATED)
    public Question create(@RequestBody @Valid Question question) {
        return questionRepository.save(question);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable @Positive Long id) {
        Optional<Question> questionOptional = questionRepository.findById(id);

        if (questionOptional.isPresent()) {
            Question question = questionOptional.get();
            questionRepository.delete(question);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> update(@PathVariable Long id, @RequestBody @Valid Question updatedQuestion) {
        Optional<Question> optionalQuestion = questionRepository.findById(id);

        if (optionalQuestion.isPresent()) {

            Question existingQuestion = optionalQuestion.get();

            existingQuestion.setText(updatedQuestion.getText());
            existingQuestion.setArea(updatedQuestion.getArea());
            existingQuestion.setSubject(updatedQuestion.getSubject());
            existingQuestion.setDifficult(updatedQuestion.getDifficult());
            existingQuestion.setAnswear(updatedQuestion.getAnswear());
            existingQuestion.setAlternatives(updatedQuestion.getAlternatives());

            questionRepository.save(existingQuestion);

            return ResponseEntity.ok(existingQuestion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
