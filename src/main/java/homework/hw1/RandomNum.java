package homework.hw1;import java.util.Random;
import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
    Random random = new Random();
    int random_generated = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello amigo! What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the game begin! Please insert your number: ");
        int my_number;
        do {
            my_number = scanner.nextInt();
            if (my_number < random_generated){
                System.out.println("Your number is too small. Please, try again... ");
            } else if (my_number > random_generated){
                System.out.println("Your number is too big. Please, try again... ");
            }
        }            while (my_number != random_generated);
        System.out.printf(" Congratulations %s, you won!",name);
    }
}