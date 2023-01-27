package com.codediagnostics.irms.users;

import java.util.Scanner;

public class bot {

    static String var = "north";

    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        String str = sc.nextLine().toUpperCase();
        String[] inpArr = str.split(" ");
        for (String inp : inpArr) {
            String lastTwo = inp.length() > 2 ? inp.substring(inp.length() - 2) : inp;
            int lastVal = Integer.parseInt(lastTwo);

            if (inp.contains("M")) {
                if (inp.startsWith("R")) {
                    switch (var) {
                        case "north":
                            x += lastVal;
                            var = "east";
                            break;
                        case "east":
                            y -= lastVal;
                            var = "south";
                            break;
                        case "south":
                            x -= lastVal;
                            var = "west";
                            break;
                        case "west":
                            x+=lastVal;
                            var = "north";
                            break;
                    }

                } else if (inp.startsWith("L")) {
                   switch (var){
                       case "north":
                           x -= lastVal;
                           var="west";
                           break;
                       case "west":
                           y-=lastVal;
                           var="south";
                           break;
                       case "south":
                        x+=lastVal;
                        var="east";
                        break;
                       case "east":{
                           x+=lastVal;
                           var="north";
                           break;
                       }
                   }
                }

                else {
                    System.out.println("Wrong Input");
                }
            } else {
                System.out.println("Wrong input");
            }
                }
        System.out.println(var+"("+x+","+y+")");



            }
        }
