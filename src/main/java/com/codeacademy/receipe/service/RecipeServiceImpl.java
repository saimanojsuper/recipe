package com.codeacademy.receipe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codeacademy.receipe.dao.RecipeDataRepository;
import com.codeacademy.receipe.dto.RecipeDTO;

@Service
public class RecipeServiceImpl implements RecipeService {

  @Autowired RecipeDataRepository recipeDataRepository;

  @Transactional
  @Override
  public RecipeDTO createRecipe(RecipeDTO recipeDTO) {
    return recipeDataRepository.save(recipeDTO.toEntity()).toDto();
  }

  @Override
  public boolean deleteRecipe(Long id) {
    try {
      recipeDataRepository.deleteById(id);
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  // Need to check if this works (when we pass id it should update the values
  // will think how to handle partial updates
  @Override
  public boolean updateRecipe(RecipeDTO recipeDTO) {
    try {
      recipeDataRepository.save(recipeDTO.toEntity());
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  @Override
  public RecipeDTO getRecipe(Long id) {
    return recipeDataRepository.getReferenceById(id).toDto();
  }
}
