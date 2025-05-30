package com.codeacademy.receipe.service;

import com.codeacademy.receipe.dto.RecipeDTO;

public interface RecipeService {
  RecipeDTO createRecipe(RecipeDTO recipeDTO);
//Based on this logic change response in controller
  boolean deleteRecipe(Long id);

  boolean updateRecipe(RecipeDTO recipeDTO);

  RecipeDTO getRecipe(Long id);
}
