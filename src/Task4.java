import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter input to test if its Palindrome ");
        String name=sc.next();

        String reverse = new StringBuffer(name).reverse().toString();

        if ( name.equals(reverse) )
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");


    }
}
