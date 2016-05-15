package com.epam.traine;

/**
 * Created by andreyholovan on 5/15/16.
 */
public class View {
    // Text's constants
    public static final String HELLO_PLAYER = "Hey man, input value for legs of triangle ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String HEIGHT_TRIANGLE = "Height of the triangle = ";
    public static final String HYPOTENUSE_TRIANLE = "Hypotenuse of the triangle = ";


    public void printMessage(String message){
        System.out.println(message);
    }


    public void printMessageAndDouble(String message, double value){
        System.out.println( message + String.format("%.2f",value) );
    }

}
