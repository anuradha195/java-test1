import java.util.Scanner;

public class task4_new {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter input to test if its Palindrome ");
        String input=sc.nextLine();
        input=input.toLowerCase();

        String reverse="";
        int length=input.length();

        for ( int i=length-1; i >=0; i -- )
        {
            char character = input.charAt(i);
            reverse= reverse + character;
            //reverse = reverse+input.charAt(i);
        }
        //System.out.println("Reverse: " + reverse);
        //System.out.println("Input: "+input);

        if ( input.equals(reverse)) {
            System.out.println("Input is a Palindrome");
        }

        else
            System.out.println("Input is not a palindrome");


    }
}
