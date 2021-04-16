package com.sonu.main.exception;

import java.util.List;
import java.util.Map;

public class ErrorResponse {

    private String message;

    private Map<String, String> errors;

    private List<String> details;

    public ErrorResponse() {
    }

    public ErrorResponse(String message, Map<String, String> errors) {
        this.message = message;
        this.errors = errors;
    }

    public ErrorResponse(String message, List<String> details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

}