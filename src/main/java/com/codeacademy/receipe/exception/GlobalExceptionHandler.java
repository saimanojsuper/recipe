package com.codeacademy.receipe.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

//  @ExceptionHandler(MethodArgumentNotValidException.class)
//  public ResponseEntity<> handleMethod(){
//    return ResponseEntity.()
//  }
}
