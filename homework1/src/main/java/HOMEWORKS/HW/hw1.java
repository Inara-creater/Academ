package HOMEWORKS.HW;
import java.util.Random;
import java.util.Scanner;
public class hw1 {
        public static void main(String[] args) {
            Random newRan = new Random();
            Scanner newScn = new Scanner(System.in);
            int imagine = newRan.nextInt(101);
            int numberIs;
            String name;
            System.out.println("Please enter your name: ");
            name = newScn.nextLine();
            System.out.println("Let the game begin!");
            do {
                System.out.println("Insert the number: ");
                numberIs = newScn.nextInt();
                if (numberIs < imagine){
                    System.out.println("Your number is too small. Please, try again.");
                } else if (numberIs > imagine) {
                    System.out.println("Your number is too big. Please, try again.");
                }
            } while (numberIs != imagine);
            System.out.printf("Congratulations! ", name);
        }}
