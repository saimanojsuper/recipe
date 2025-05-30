package com.codeacademy.receipe.service;

import java.util.List;

import com.codeacademy.receipe.dto.RecipeDTO;
import com.codeacademy.receipe.dto.SearchRecipe;

public interface RecipeService {
  RecipeDTO createRecipe(RecipeDTO recipeDTO);
//Based on this logic change response in controller
  boolean deleteRecipe(Long id);

  boolean updateRecipe(RecipeDTO recipeDTO);

  RecipeDTO getRecipe(Long id);

  List<RecipeDTO> getRecipes(SearchRecipe searchRecipe);
}
