package com.codediagnostics.irms.users;

public class move {
    static String directions = "north";

    public static String movementResult(String move) {
        int x = 0;
        int y = 0;


        String[] moveArray = null;

        moveArray = move.split(" ");

        for (String str : moveArray) {
            String subString = str.length() > 2 ? str.substring(str.length() - 2) : str;
            int result = Integer.parseInt(subString);
            if (str.contains("RM")) {
                if (directions.equals("north")) {
                    x += result;
                    directions = "east";

                } else if (directions.equals("east")) {
                    x -= result;
                    directions = "south";

                } else if (directions.equals("south")) {
                    x -= result;
                    directions = "west";

                } else {
                    x += result;
                    directions = "north";
                }
            } else if (str.contains("LM")) {
                if (directions.equals("north")) {
                    y -= result;
                    directions = "west";

                } else if (directions.equals("west")) {
                    y -= result;
                    directions = "south";

                } else if (directions.equals("south")) {
                    y += result;
                    directions = "east";

                } else {
                    y += result;
                    directions = "north";
                }
            } else {
                return "Enter Valid ";
            }


        }
        return directions + "(" + x + "," + y + ")";


    }

    public static void main(String[] args) {
        String move = "RM20 RM40 LM20";
        System.out.println(movementResult(move));


    }
}