package com.example.backend.repository;

import org.springframework.stereotype.Repository;

import com.example.backend.model.Quote;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuoteReposirory extends JpaRepository<Quote, Integer> {

}
