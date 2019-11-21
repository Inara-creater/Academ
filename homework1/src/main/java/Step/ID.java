package Step;

import java.util.Random;

public class ID {
    public static String generate(){
    Random random = new Random();
    int letters = random.nextInt(26) + 'A';
        int numbers = random.nextInt(100) + 100;
        return String.valueOf((char)letters) + String.valueOf(numbers);


    }
    }
