import java.util.Scanner;

public class Task6 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String new_number = sc.next();
        int count_open=0, count_close=0;
        //String new_number = number.replaceAll("[ ^(){}]", "");
        //System.out.println(new_number);

        for ( int i=0; i < new_number.length() ; i ++)
        {
            char character = new_number.charAt(i);
            if (new_number.charAt(i)=='(' || new_number.charAt(i)=='{' || new_number.charAt(i)=='['  )
                count_open++ ;
            else if (new_number.charAt(i)==')' || new_number.charAt(i)=='}' || new_number.charAt(i)==']'  )
                count_close++;

        }
        if ( count_open == count_close)
            System.out.println("valid");
        else if ( count_open > count_close)
            System.out.println("there are a few unmatched Open parenthesis");
        else
            System.out.println("there are a few unmatched Closing parenthesis\"");


    }
}
