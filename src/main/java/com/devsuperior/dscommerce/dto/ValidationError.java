package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

    private List<Fieldmessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<Fieldmessage> getErrors() {
        return errors;
    }
    public void addError(String fieldName, String message){
        errors.add(new Fieldmessage(fieldName, message));
    }
}
