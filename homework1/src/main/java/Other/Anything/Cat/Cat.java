package Other.Anything.Cat;

public class Cat extends Animals {

    private int age;
    private String breed;
    private String name;

    public Cat(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {

    }
    public void say(){
        System.out.println("Meow");
    }



    @Override
    public String toString(){
        return " Cat's name: " + name + "; Breed: "+ breed + "; Age: " + age;
    }
}
