package com.example.frontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.frontend.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
