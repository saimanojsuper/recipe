package com.codeacademy.receipe.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.codeacademy.receipe.dao.RecipeDataRepository;
import com.codeacademy.receipe.dto.RecipeDTO;

public class RecipeServiceImplTest {
  @Mock private RecipeDataRepository recipeDataRepository;

  @InjectMocks private RecipeServiceImpl recipeService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  @Disabled
  public void testCreate() {

    when(recipeDataRepository.save(any())).thenReturn(RecipeDTO.builder().name("curd").build());

    RecipeDTO recipe = recipeService.createRecipe(RecipeDTO.builder().build());

    Assertions.assertNotNull(recipe);
    Assertions.assertEquals("curd", recipe.getName());
  }



}
