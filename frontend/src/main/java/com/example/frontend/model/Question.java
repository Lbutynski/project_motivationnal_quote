package com.example.frontend.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private String question;
  private String answer;
  private String user;
  private Date date;

  public Question() {
  }

  public Question(String question, String user, Date date) {
    this.question = question;
    this.user = user;
    this.date = date;
  }

  public Question(String question, String answer, String user, Date date) {
    this.question = question;
    this.answer = answer;
    this.user = user;
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
