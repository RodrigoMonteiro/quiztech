package com.quiz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.demo.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
    
}
