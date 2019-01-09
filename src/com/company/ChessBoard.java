package com.company;

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
//    public static void main(String[] args){
//        String whiteColor = "WW";
//        String blackColor = "BB";
//        for(int i=1;i<=8;i++){
//            for(int j=1;j<=8;j++){
//                if(i%2==1 && j%2==1) {
//                    System.out.print(whiteColor + "|");
//                }else if(j%2==0 && i%2==0) {
//                    System.out.print(whiteColor + "|");
//                }else {
//                    System.out.print(blackColor + "|");
//                }
//            }
//            System.out.println();
//        }
//    }
}
