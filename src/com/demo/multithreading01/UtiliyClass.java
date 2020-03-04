package com.demo.multithreading01;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class UtiliyClass {
    // This class intended to be used for practices or any idea that comes up as I practise multithreading
    // It may not be related to multithreading.
    public static void main (String [] args){

        System.out.println(getBooleanInstance(true));
    }

    public static Boolean getBooleanInstance (boolean val ){

        return val ? TRUE: FALSE;
    }
}
