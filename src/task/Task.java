package task;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int hum, com, left = 21;
        int total = 21;
        System.out.println("There are 21 beer bottles...");
        System.out.println("Computer and yourself, there are 2 players");
        System.out.println("At a time, each one can pick up any number of bottles\n"
                + "between 1 and 4 (inclusive)");
        System.out.println("Will you like to play first?");
        String inp = sc.nextLine();
        boolean a = inp.equalsIgnoreCase("yes");
        while (!a) {
            System.out.println("enter yes to start the game");
            inp = sc.nextLine();
            a = inp.equalsIgnoreCase("yes");
        }
        if (a) {
            while (left > 1) {

                System.out.println("How many you would like to pick up?");
                hum = sc.nextInt();
                while (hum < 1 || hum > 4) {
                    System.out.println("Please enter a value between 1-4");
                    hum = sc.nextInt();
                    
                   
                }
                com = 5 - hum;
                System.out.println("Computer has picked " + com);
                left = left - hum - com;
                System.out.println("The bottles remaining are: " + left);
                if (left == 1) {
                    System.out.println("You will have to pick up the last..you are loser");
                    break;
                }
            }

        }

    }

}


