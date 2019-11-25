package homework.hw4;

public class HappyFamily {
    static Pet pet = new Pet();
    public static void main(String[] args) {
        pet.species = "Maine Coon";
        pet.nickname = "Po";
        pet.age = 1;
        pet.trickLevel = 90;
        pet.habits = new String[]{"sleeping, observing, foxing, lying"};
        System.out.println(pet);



    }
}
