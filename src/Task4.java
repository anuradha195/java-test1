import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter input to test if its Palindrome ");
        String name=sc.next();

        /*
        Scanner sc=new Scanner(System.in);
        String word = sc.next();
        String test="null";
        for ( int i= (word.length() - 1); i>= 0 ; i--)
        {
            char c= word.charAt(i);
            test=test+c;
        }
        */

        String reverse = new StringBuffer(name).reverse().toString();

        if ( name.equals(reverse) )
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");


    }
}
