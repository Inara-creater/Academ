package Other.FromLessons;

import java.util.Arrays;

public class November12 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array[i] = (int)(Math.random()*50+10);
        }
        System.out.println(Arrays.toString(array));
       int min = array[0];
       int max = array[0];
       for (int i = 1; i < array.length; i++){
           if (array[i] < min){
               min = array[i];
           }

           if(array[i] > max) {
               max = array[i];
           }
       }
        System.out.println(min);
        System.out.println(max);
}
    }
