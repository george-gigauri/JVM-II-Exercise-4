package com.george.gigauri.exercise4.repository;

import com.george.gigauri.exercise4.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
