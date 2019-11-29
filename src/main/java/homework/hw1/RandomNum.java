package homework.hw1;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
    Random random = new Random();
    int random_generated = random.nextInt(101);
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: " );
        String name = scanner.nextLine();
        System.out.println("Let the game begin!");
    }

}

