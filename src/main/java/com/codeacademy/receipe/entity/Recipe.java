package com.codeacademy.receipe.entity;

import com.codeacademy.receipe.dto.RecipeDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "ingredients", nullable = false)
  private String ingredients;

  @Column(name = "instructions", nullable = false)
  private String instructions;
  //Inminutes
  @Column(name = "time", nullable = false)
  private Integer time;

  public RecipeDTO toDto(){
    return RecipeDTO.builder()
        .id(id)
        .time(time)
        .name(name)
        .instructions(instructions)
        .ingredients(ingredients)
        .build();
  }
}
