package com.etiya.cleanCodeDemo.core.utilites.exceptions.problemDetails;

public class BusinessProblemDetails extends ProblemDetails {
    public BusinessProblemDetails() {
        setTitle("Business Rule Violation");
        setType("http://etiya.com/exceptions/business");
        setStatus("400");
    }
}
