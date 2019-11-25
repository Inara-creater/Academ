package homework.hw4;
public class Human {
    String name;
    String surname;
    int dateOfBirth;
    int IQ;
    Pet cat;
    String mother;
    String father;
    void greetPet (){
        System.out.println("Hello " + cat);
    }
    void describePet(){
        System.out.println("I have a " +);
    }

    @Override
    public String toString() {
        return "Human{name: " + name
                + ", surname: " + surname
                + ", dateOfBirth: " + dateOfBirth
                + ", IQ: " + IQ
                + ", pet: " + cat
                + ", mother " + mother
                + ", father " + father
                + "}";
    }
}
