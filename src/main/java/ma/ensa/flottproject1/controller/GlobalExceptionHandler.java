package ma.ensa.flottproject1.controller;

import ma.ensa.flottproject1.dtos.CustomErrorResponse;
import ma.ensa.flottproject1.exceptions.RessourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RessourceNotFoundException.class)
    public ResponseEntity<CustomErrorResponse> handleResourceNotFoundException(RessourceNotFoundException ex) {
        CustomErrorResponse customErrorResponse = new CustomErrorResponse(ex.getResourceType(), ex.getResourceId(), ex.getErrorMessage());
        return new ResponseEntity<>(customErrorResponse, HttpStatus.NOT_FOUND);
    }

}
