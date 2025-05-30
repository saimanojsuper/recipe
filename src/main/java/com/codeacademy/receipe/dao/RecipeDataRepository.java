package com.codeacademy.receipe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeacademy.receipe.entity.Recipe;

@Repository
public interface RecipeDataRepository extends JpaRepository<Recipe,Long> {

}
