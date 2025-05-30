package com.codeacademy.receipe.dto;

import lombok.Data;

@Data
public class SearchRecipe {
  private Integer pageNumber;
  private Integer batchSize;
  private String sortByFieldName;
  private String isAscending;
}
