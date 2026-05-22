package com.example.textapp.repository;

import com.example.textapp.entity.TextData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextDataRepository extends JpaRepository<TextData, Long> {
}