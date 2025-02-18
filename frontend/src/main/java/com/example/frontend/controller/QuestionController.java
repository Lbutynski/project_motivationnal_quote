package com.example.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.frontend.model.Question;
import com.example.frontend.service.QuestionService;

@Controller
public class QuestionController {
  QuestionService questionService;

  @GetMapping("form")
  public String getForm(Model model) {
    return "form";
  }

  @PostMapping("submit")
  public String submitForm(@RequestParam String question, @RequestParam String name, Model model) {
    Question questionWithAnswer = questionService.addQuestion(question, name);
    model.addAttribute("question", question);
    return "result";
  }
}
