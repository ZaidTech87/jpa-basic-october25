package com.example.jpa_basic_october;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardReposatory extends JpaRepository<Card, Integer> {
}
