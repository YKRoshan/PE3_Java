/*
* Write a java program to calculate first and last date of a week.
  Output:
  First Date of Week:             Mon 24/07/2017
  Last date of the week:          Sun 30/07/2017

* */
package com.stackroute.pe3;

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
}
