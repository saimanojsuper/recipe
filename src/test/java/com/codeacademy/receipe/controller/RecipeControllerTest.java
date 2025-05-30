package com.codeacademy.receipe.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.codeacademy.receipe.dto.RecipeDTO;
import com.codeacademy.receipe.service.RecipeService;

public class RecipeControllerTest {
  @Mock private RecipeService recipeService;
  @InjectMocks private RecipeController recipeController;

  private MockMvc mockMvc;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
  }

  @Test
  public void testuploadMood() throws Exception {

    String jsonPayload =
        "{\n" + "    \"name\" : \"curd rice\",\n" + "    \"ingredients\": \"curd, rice\",\n" +
            "    \"instructions\" : \"mix curd with rice\",\n" + "    \"time\" : 10\n" + "}";

    when(recipeService.createRecipe(any())).thenReturn(RecipeDTO.builder().name("curd").build());

    MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/api/recipe/create")
        .contentType(MediaType.APPLICATION_JSON)
        .content(jsonPayload)).andExpect(status().isOk()).andReturn();

    String actual = result.getResponse().getContentAsString();
    Assertions.assertNotNull(actual);
    // just tos it's returning correctly
    Assertions.assertTrue(actual.contains("curd"));
  }

  @Test
  public void testFailureTest() throws Exception {

  }
}
