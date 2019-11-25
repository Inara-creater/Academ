package homework.hw4;

public class HappyFamily {
    static Pet pet = new Pet();
    static Human human = new Human();
    public static void main(String[] args) {
        pet.species = "Maine Coon";
        pet.nickname = "Po";
        pet.age = 1;
        pet.trickLevel = 90;
        pet.habits = new String[]{"sleeping", "observing", "meowing", "lying"};
        human.name = "Santino";
        human.surname = "Azalya";
        human.dateOfBirth = 1989;
        human.IQ = 98;
        human.cat = pet;
        human.mother ="Lena";
        human.father = "Balazzo";

        System.out.println(human);
        human.greetPet();




    }
}
