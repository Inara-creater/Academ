package Other.HashCode;

public class MyClass {
    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object object){
        MyClass other = (MyClass)object;
        return id.equals(other.id) && name.equals(other.name);
    }
}
