package homework.hw2;

import java.util.Random;
import java.util.Scanner;

public class ShootingArea {


    public static void main(String[] args) {
         Display display = new Display();
         Fill fill = new Fill();

        //
        String array [] [] = new String[6][6];

       Random random = new Random();
       Scanner scn = new Scanner(System.in);
       boolean flag = true;

        int valueX = random.nextInt(5) + 1;
        int valueY = random.nextInt(5) + 1;

        //fill  array
        fill.fillArray(array);




        //infinity loop
        while (flag){

            System.out.println("All set. Get ready to rumble!");
          //  System.out.println("chsnumber1 =  " + valueX + ",   = " + valueY);
            System.out.println("Please enter the first value : " );
            int chsnumber1 = scn.nextInt();
            System.out.println("Please enter the second value : " );
            int chsnumber2 = scn.nextInt();


            if (chsnumber1 == valueX && chsnumber2 == valueY){
                array[chsnumber1][chsnumber2] = "X|";
                System.out.println("You have won!!!!");
                display.displayArray(array);
                flag = false;

            }else {
                array[chsnumber1][chsnumber2] = "*|";
                display.displayArray(array);
            }
        }


    }
}











