package com.codeacademy.receipe.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class RecipeDataRepositoryTest {

  @Autowired private RecipeDataRepository recipeDataRepository;

  @Test
  public void databaseScripts() {
    long count = recipeDataRepository.count();

    //In the db scripts 5 users + one in setup method are created
    Assertions.assertEquals(10L, count);
  }

  // write db test cases for the remaining fields
}
