package Step;

import java.util.Random;

public class ID {
public String generate(){
    Random random = new Random();
    int letter = random.nextInt(26) + 'A';
    int number = random.nextInt(100) + 100;
    return String.valueOf((char)letter) + String.valueOf(number);
}

    }
