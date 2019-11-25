package homework.hw4;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    @Override
    public String toString() {
        return "Cat{nickname: " + nickname
                + ", age: " + age
                + ", trickLevel: " + trickLevel
                + ", habits: " + habits;
    }
}
