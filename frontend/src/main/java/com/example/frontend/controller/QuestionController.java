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
  private final QuestionService questionService;

  public QuestionController(QuestionService questionService) {
    this.questionService = questionService;
  }

  @GetMapping("chat")
  public String getForm(Model model) {
    model.addAttribute("question", null);
    return "chat";
  }

  @PostMapping("chat")
  public String submitForm(@RequestParam String question, @RequestParam String name, Model model) {
    Question questionWithAnswer = questionService.addQuestion(question, name);
    model.addAttribute("question", questionWithAnswer);
    return "chat";
  }

  @GetMapping("/")
  public String getHome() {
    return "home";
  }

  @GetMapping("/admin")
  public String getAdmin(Model model) {
    model.addAttribute("users", questionService.getUsers());
    model.addAttribute("selectedUser", null);
    model.addAttribute("questions", null);
    return "admin";
  }

  @PostMapping("/admin")
  public String postAdmin(@RequestParam String selectedUser, Model model) {
    model.addAttribute("users", questionService.getUsers());
    model.addAttribute("selectedUser", selectedUser);
    model.addAttribute("questions", questionService.getQuestionsByUser(selectedUser));
    return "admin";
  }
}
