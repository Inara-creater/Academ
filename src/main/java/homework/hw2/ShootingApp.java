package homework.hw2;

import java.util.Random;
import java.util.Scanner;
public class ShootingApp {
    public static void main(String[] args) {
        int[][] square = new int[6][6];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        System.out.println("Please enter a line for fire...");
        int player = scanner.nextInt();
        int target = random.nextInt();

    }
}
