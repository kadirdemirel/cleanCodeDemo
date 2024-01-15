package com.etiya.cleanCodeDemo.core.utilites.exceptions.problemDetails;

import lombok.Data;

import java.util.Map;
@Data
public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails() {
        setTitle("Validation Rule Violation");
        setDetail("Validation Problem");
        setType("http://etiya.com/exceptions/validations");
        setStatus("400");
    }
    private Map<String,String> errors;
}
