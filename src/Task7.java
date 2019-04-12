import java.util.Scanner;

public class Task7 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");

        String new_number = sc.next();

        for ( int i=0; i < new_number.length() ; i ++)
        {
            char character = new_number.charAt(i);
            if (new_number.charAt(i)=='(' && new_number.charAt(i+1) != ")"){
                int repeat_chars= new_number.charAt(i+1);
                int repeat_times=new_number.charAt(i+3);
                for( int j=repeat_chars; j < repeat_times; j++){
                    new_number+=j;
                }
            }
        }


    }
}
