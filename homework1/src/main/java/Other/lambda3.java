package Other;

public class lambda3
{
    interface Funcint1
    {
        int operation (int a, int b);
    }

    interface Funcint2
    {
        void sayMessage(String message);
    }
    private int operate(int a, int b, Funcint1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args)
    {
        Funcint1 add = (int x, int y)-> x+y;
        Funcint1 multiply = (int x, int y)-> x*y;

        lambda3 lobj = new lambda3();

        System.out.println("Addition is " +
                lobj.operate(9,8, add));

        System.out.println("Multiplication is " +
                lobj.operate(32 ,65, multiply));

            Funcint2 fobj2 = message -> System.out.println("Good night "
                    + message);

                fobj2.sayMessage("Inara");


    }
}
