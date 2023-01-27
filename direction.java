package com.codediagnostics.irms.users;

import java.util.Scanner;

public class direction {
    public static int getCo(String data) {

        return Integer.parseInt(data.replaceAll("[^0-9]", ""));
    }
    static String pointer="north";

    public static void main(String[] args) {

        int x = 0, y = 0;

        System.out.println("Enter the direction");
        Scanner sc = new Scanner(System.in);
        String des = sc.nextLine();
        String[] dir = des.split(" ");

        for (String data : dir) {
            if (data.contains("RM")) {
                int co = getCo(data);

                switch (pointer) {
                    case "north":
                        x += co;
                        pointer = "east";
                        break;

                    case "east":
                        y -= co;
                        pointer = "south";
                        break;

                    case "south":
                        x -= co;
                        pointer = "west";
                        break;

                    case "west":
                        y += co;
                        pointer = "north";
                        break;
                }

            } else if (data.contains("LM")) {
                int co = getCo(data);

                switch (pointer) {
                    case "north":
                        x -= co;
                        pointer = "west";
                        break;

                    case "west":
                        y -= co;
                        pointer = "south";
                        break;

                    case "south":
                        x += co;
                        pointer = "east";
                        break;

                    case "east":
                        y += co;
                        pointer = "north";
                        break;
                }
            } else
                System.out.println("Enter in correct order");

        }
        System.out.println(pointer + "(" + x + "," + y + ")");
    }

}