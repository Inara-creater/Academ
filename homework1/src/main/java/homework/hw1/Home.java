package homework.hw1;

import java.util.*;
public class Home
{
    static Scanner console = new Scanner (System.in);
    public static void main (String []args)
    {

        int x, y, z;

        System.out.println("Enter three integer: ");
        x = console.nextInt();
        y = console.nextInt();
        z = console.nextInt();

        if
        ( x > y)
            if
            (x > z)
                if
                (y > z)

                    System.out.println("Ascending your number: " + z + " " + y + " " + x);
        System.out.println();
        if
        (y > x)
            if
            (y > z)
                if
                (x > z)

                    System.out.println("Ascending your number: "  + y + " " + x + " " + z);
        System.out.println();

        if
        (z > x)
            if
            (z > y)
                if
                (y > x)
                    System.out.println("Ascending your number: "  + x + " " + y + " " + z);
        System.out.println();
    }
}