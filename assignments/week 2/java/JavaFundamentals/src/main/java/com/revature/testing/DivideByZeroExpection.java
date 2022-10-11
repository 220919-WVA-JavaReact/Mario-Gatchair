package com.revature.testing;

public class DivideByZeroException extends RuntimeException{

    // Constructor
    public DivideByZeroException(String errorMessage){
        super(errorMessage);
    }
}