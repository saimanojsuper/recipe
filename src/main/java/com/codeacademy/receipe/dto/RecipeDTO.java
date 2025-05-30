package com.codeacademy.receipe.dto;

import com.codeacademy.receipe.entity.Recipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
  private Long id;

  private String name;

  private String ingredients;

  private String instructions;

  private Integer time;

  public Recipe toEntity() {
    return Recipe.builder()
        .id(this.id)
        .name(this.name)
        .ingredients(this.ingredients)
        .instructions(this.instructions)
        .time(this.time)
        .build();
  }
}
