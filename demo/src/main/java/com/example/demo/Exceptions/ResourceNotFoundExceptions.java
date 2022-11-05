package com.example.demo.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundExceptions extends Exception{
    private String name;
    private String fieldName;
    private Long fieldValue;


    public ResourceNotFoundExceptions(String name, String fieldName, Long fieldValue) {
        super(String.format("%s not found in table %s of id %l",fieldName,name,fieldValue));
        this.name = name;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
