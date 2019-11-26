package homework.hw4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits = new String[]{"sleeping", "observing", "meowing", "lying"};
    @Override
    public String toString() {
        return "cat{nickname: " + nickname
                + ", age: " + age
                + ", trickLevel: " + trickLevel
                + ", habits: " + Arrays.toString(habits)
                + "}";
    }
}
