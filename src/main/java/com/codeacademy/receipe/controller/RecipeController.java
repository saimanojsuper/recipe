package com.codeacademy.receipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeacademy.receipe.dto.RecipeDTO;
import com.codeacademy.receipe.service.RecipeService;

@RestController
@RequestMapping("/api/recipe/")
public class RecipeController {

  @Autowired RecipeService recipeService;

  @PostMapping(path = "create")
  public ResponseEntity<RecipeDTO> createRecipe(@RequestBody RecipeDTO recipeDTO) {
    return ResponseEntity.ok(recipeService.createRecipe(recipeDTO));
  }

  // Need to valid for invalid id, else it will create the new one
  @PostMapping(path = "update")
  public ResponseEntity<String> updateRecipe(@RequestBody RecipeDTO recipeDTO) {
    return ResponseEntity.ok(
        recipeService.updateRecipe(recipeDTO) ? "Successfully Updated" : "Failed to update");
  }

  // Need to throw invalid id if not present
  @GetMapping(path = "delete/{id}")
  public ResponseEntity<String> deleteRecipe(@PathVariable Long id) {
    return ResponseEntity.ok(recipeService.deleteRecipe(id) ? "Successfully Deleted" : "Failed to delete");
  }

  @GetMapping(path = "getRecipe/{id}")
  public ResponseEntity<RecipeDTO> getById(@PathVariable Long id) {
    return ResponseEntity.ok(recipeService.getRecipe(id));
  }

}
