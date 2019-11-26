package Other.Anything.Cat;

import Other.Anything.Person.Person;

public class Sportsman extends Person {
    private String typeSport;

    public Sportsman(String name, String surname, int age, Cat cat) {
        super(name, surname, age, cat);
    }


    public String getTypeSport(){
        return typeSport;
    }
    public void setTypeSport(String typeSport){
        this.typeSport = typeSport;
    }

}
