package Other.twenty9Oct;

interface FuncInterface
{
    void abstractFun(int x);

    default void normalFun()
    {
        System.out.println("Hello");
    }
}
class lambda
{
    public static void main(String[] args)
    {
        FuncInterface fobj = (int x)-> System.out.println(2*x);
        fobj.abstractFun(5);

    }

}
