package Other;

import java.util.Random;

public class File2 {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int rnd2 = random.nextInt(10)+11;
            System.out.println(rnd2);
        }

    }

}
