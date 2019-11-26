package Other.Impl;

import Other.Anything.Person.Person;

public class BusDriver implements Transport, Driver{

    private Person person;
    private String category;
    private int speed = 60;

    @Override
    public void setCategory(String c) {
        this.category = c;
        person = new Person("Aziz", "Azizli", 36, null);

    }

    @Override
    public void go() {
        if(person != null){
            System.out.println("Go!");
        }else {
            System.out.println("Stop!");
        }

    }

    @Override
    public int getSpeed() {
        return this.speed;

    }
}
