/*
* Write a program to create a ChessBoard pattern with the help of multidimensional
 * array, where WWrepresents white color and BB represents Black color.
 Output:
 My Chess Board
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|
      WW|BB|WW|BB|WW|BB|WW|BB|
      BB|WW|BB|WW|BB|WW|BB|WW|

* */
package com.stackroute.pe3;

public class ChessBoard {
    public String chessBoard(){
        String whiteColor = "WW";
        String blackColor = "BB";
        String result = "";
        for(int i=1;i<=8;i++){
            for(int j=1;j<=8;j++){
                if(i%2==1 && j%2==1) {
                    result+=(whiteColor + "|");
                }else if(j%2==0 && i%2==0) {
                    result+=(whiteColor + "|");
                }else {
                    result+=(blackColor + "|");
                }
            }
            result+="\n";
        }
        return result;
    }
}
