package homework.hw1;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
 class NumbersHW1 implements Serializable {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
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
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("Number.out: "));
            objectOutputStream.writeObject(numberIs);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("Number.out: "));
            NumbersHW1 numbersHW1  = (NumbersHW1) objectInputStream.readObject();
            objectInputStream.close();


            System.out.println("Got: " + numberIs + "\n");
        }}
