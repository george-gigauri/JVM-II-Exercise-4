package com.george.gigauri.exercise4.controller;

import com.george.gigauri.exercise4.model.Category;
import com.george.gigauri.exercise4.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable("id") int id) {
        return categoryRepository.getById(id);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @DeleteMapping("/categories")
    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    @DeleteMapping("/categories/{id}")
    public void deleteById(@PathVariable("id") int id) {
        categoryRepository.deleteById(id);
    }
}
