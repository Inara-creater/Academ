package Other.Anything;

import Other.Anything.Cat.Cat;
import Other.Anything.Cat.Sportsman;
import Other.Anything.Person.Person;
import Other.Impl.BusDriver;

public class Main {

    static Cat cat ;
    static Person person ;

    public static void main(String[] args) {

//        cat = new Cat(1, "Maine Coon", "Vasiliy");
//        person = new Person("Inara", "Mustafayeva", 18, cat);
//
//        System.out.println(person);
//        person.getCat().say();
//
//
//        Sportsman sportsman = new Sportsman("Kevin","Jafarzade", 9, null);
//        sportsman.setTypeSport("Tennis");

        BusDriver m = new BusDriver();
        System.out.println(m.getSpeed());
//        m.setCategory("C");
        m.go();
    }
}
