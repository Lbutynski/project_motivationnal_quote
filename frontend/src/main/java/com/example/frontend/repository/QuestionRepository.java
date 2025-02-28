package com.example.frontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.frontend.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
  @Query(value = "SELECT * FROM question WHERE user = ?1", nativeQuery = true)
  Question[] findAllByUser(String user);

  @Query(value = "SELECT DISTINCT user FROM question", nativeQuery = true)
  String[] findDistinctUser();
}
