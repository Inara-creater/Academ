import java.util.Scanner;

public class Palindrome {
    public static void main(String arg[])
    {
        int number,t,i,remainder;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number ");
        number=scanner.nextInt();
        t=number;
        for(i=0;number>0;number/=10)
        {
            remainder=number%10;
            i=(i*10)+remainder;
        }
        if(i==t)
            System.out.println(t+" is a palindrome number ");
        else
            System.out.println(t+" is not a palindrome number ");


    }
}
