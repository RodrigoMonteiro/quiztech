package com.quiz.demo.model;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Entity
@Table(name = "Questions")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("_id")
  private Long id;

  @NotBlank
  @NotNull
  @Length(min = 2, max = 500)
  private String text;

  @NotNull
  @Pattern(regexp = "Back-end|Front-end|DevOps")
  @Length(min = 2, max = 10)
  private String area;

  @NotBlank
  @NotNull
  @Length(min = 2, max = 20)
  private String subject;

  @NotBlank
  @NotNull
  @Length(min = 2, max = 50)
  private String difficult;

  @NotBlank
  @NotNull
  private String answer;

 
  @NotEmpty
  private String[] alternatives;

}
