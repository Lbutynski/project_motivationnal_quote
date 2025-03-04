package com.example.frontend.service;

import java.sql.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.frontend.model.Question;
import com.example.frontend.repository.QuestionRepository;

@Service
public class QuestionService {
  private final QuestionRepository questionRepository;

  public QuestionService(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  public String getRandomAnswer() {
    String URL = "http://localhost:8081/api/getQuote";
    RestTemplate restTemplate = new RestTemplate();
    String quote = restTemplate.getForObject(URL, String.class);
    return quote;
  }

  public Question addQuestion(String question, String user) {
    Question questionToSave = new Question(question, getRandomAnswer(), user, new Date(System.currentTimeMillis()));

    this.questionRepository.save(questionToSave);
    return questionToSave;
  }

  public Question[] getQuestionsByUser(String user) {
    return this.questionRepository.findAllByUser(user);
  }

  public String[] getUsers() {
    return this.questionRepository.findDistinctUser();
  }
}
