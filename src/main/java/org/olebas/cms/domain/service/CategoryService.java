package org.olebas.cms.domain.service;

import org.olebas.cms.domain.model.Category;
import org.olebas.cms.domain.repository.CategoryRepository;
import org.olebas.cms.domain.vo.CategoryRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category update(String id, CategoryRequest categoryRequest) {
        final Category category = this.categoryRepository.findOne(id);
        category.setName(categoryRequest.getName());
        return this.categoryRepository.save(category);
    }

    public Category create(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        return this.categoryRepository.save(category);
    }

    public void delete(String id) {
        final Category category = this.categoryRepository.findOne(id);
        this.categoryRepository.delete(category);
    }

    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    public Category findOne(String id) {
        return this.categoryRepository.findOne(id);
    }
}
