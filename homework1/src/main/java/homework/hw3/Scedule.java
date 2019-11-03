package homework.hw3;

import java.util.Scanner;

public class Scedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] Scedule = new String[7][2];
        Scedule[0][0] = "Sunday";
        Scedule[0][1] = "Go to courses ACCA ";
        Scedule[1][0] = "Monday";
        Scedule[1][1] = "Go to university and do homework ";
        Scedule[2][0] = "Tuesday";
        Scedule[2][1] = "Learn Java. Be ready for lessons ";
        Scedule[3][0] = "Wednesday";
        Scedule[3][1] = "Grind away. Finish your work ";
        Scedule[4][0] = "Thursday";
        Scedule[4][1] = "Go to IBA (Stay motivated!) ";
        Scedule[5][0] = "Friday ";
        Scedule[5][1] = "Do not stop studying ";
        Scedule[6][0] = "Saturday";
        Scedule[6][1] = "Go to courses, then do your art";
        System.out.println("Please, input the day of the week: ");

        while (true){
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            switch (input.replaceAll("\\s+", " ")){
                case "SUNDAY":
                    System.out.println(Scedule[0][1]);
                    break;
                case "MONDAY":
                    System.out.println(Scedule[1][1]);
                    break;
                case "TUESDAY":
                    System.out.println(Scedule[2][1]);
                    break;
                case "WEDNESDAY":
                    System.out.println(Scedule[3][1]);
                    break;
                case "THURSDAY":
                    System.out.println(Scedule[4][1]);
                    break;
                case "FRIDAY":
                    System.out.println(Scedule[5][1]);
                    break;
                case "SATURDAY":
                    System.out.println(Scedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again. ");
            }
        }
    }
}
