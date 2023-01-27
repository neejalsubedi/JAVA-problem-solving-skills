package com.codediagnostics.irms.users;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;

import java.util.Scanner;

public class botPath {
    static  String  variable ="north";

    public static void main(String[] args) {
        System.out.println("input the movement as:" +"\n"+
                "RM'coordinates' :for right" +"\n"+
                "LM'cordinates'  :for left");
        Scanner sc =new Scanner(System.in);
        //String M= sc.next();

        int x=0;
        int y= 0;


        String M= sc.nextLine().toUpperCase();

        String[] Ma =M.split("");

      for (String in: Ma) {
          String l = in.length()>2? in.substring(in.length() - 2) :in;
          int il = Integer.parseInt(l);


          if (in.contains("M")) {
              if (in.startsWith("R")) {
                  x+=il;
              } else if (in.startsWith("L")) {
                  x-=il;
              } else {
                  System.out.println("wrong input");
              }

              }else {
              System.out.println("wrong input");
          }

          }
   if(x>0){
       System.out.println("East("+x+","+y+")");
   } else if (x<0) {
       System.out.println("West("+x+","+y+")");

   }
else {
       System.out.println("O(0,0)");
   }

    }
}







