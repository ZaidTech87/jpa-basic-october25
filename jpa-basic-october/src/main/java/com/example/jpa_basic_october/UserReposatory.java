package com.example.jpa_basic_october;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserReposatory extends JpaRepository<User,Integer> {
}
