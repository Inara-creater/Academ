package Other.Anything.Person;

import Other.Anything.Cat.Cat;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Cat cat;


    public Person(String name, String surname, int age, Cat cat) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString(){
        return "Person[Name: "+ name + "; Surname: " + surname + "; Age: " + age + ". Has a cat. " + cat + ".]";
    }
}
