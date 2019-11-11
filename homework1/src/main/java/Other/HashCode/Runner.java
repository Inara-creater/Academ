package Other.HashCode;

public class Runner {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(1L, "name");
        MyClass m2 = new MyClass(1L, "name");
        if (m1.equals(m2)){
            System.out.println("Ok");
        }
    }
}
