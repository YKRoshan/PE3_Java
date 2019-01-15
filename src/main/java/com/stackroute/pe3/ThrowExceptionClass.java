/*
*  Write a program that will generate exceptions of type NegativeArraySizeException,
*  IndexOutOfBoundsException, NullPointerException. Record the catching of each exception
*  by displaying the message stored in the exception object.
 * */
package com.stackroute.pe3;

public class ThrowExceptionClass {
    public static void main(String[]args){
        try {
            Exception exception = new Exception("It is a exception");
            throw exception;
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Finally block.");
        }
    }
}
