package com.company;

import java.util.*;
 import java.text.*;

public class FirstAndLastDayOfWeek {

    public String firstAndLastDayOfWeek(){
        Calendar c = Calendar.getInstance();
        String result = "";
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        result+=(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        result+=" ";
        result+=(df.format(c.getTime()));
       return result;
    }
//    public static void main(String []args){
//        Calendar c = Calendar.getInstance();
//
//        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//
//        System.out.println();
//        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
//        System.out.println(df.format(c.getTime()));
//        for (int i = 0; i <6; i++) {
//            c.add(Calendar.DATE, 1);
//        }
//        System.out.println(df.format(c.getTime()));
//        System.out.println();
//    }
}
