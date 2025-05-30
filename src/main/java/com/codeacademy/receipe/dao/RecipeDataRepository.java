package com.codeacademy.receipe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.codeacademy.receipe.entity.Recipe;

@Repository
public interface RecipeDataRepository extends JpaRepository<Recipe,Long> {

  String queryFilter = "select * from recipe limit :batchSize offset :startNumber";

  @Query(value = queryFilter, nativeQuery = true)
  List<Recipe> getRecipeData(
      @Param("batchSize") Integer batchSize,
      @Param("startNumber") Integer startNumber
  );

}
