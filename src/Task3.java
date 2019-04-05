import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)
    {
        int t1=1, t2=1, t3=0;
        System.out.println("Fibonacci series Upto 40 is: ");
        System.out.print(t1+" , "+t2+" , ");
        for ( int i=0; i < 40; i++)
        {
            t3=t1+t2;
            System.out.print(t3 + " , ");
            t1=t2;
            t2=t3;
        }

    }
}
