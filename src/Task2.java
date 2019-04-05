import java.util.Scanner;

public class Task2
{

    public static void main(String[] args)
    {

        /*System.out.println("Hello User, Good Day!!!");
        System.out.println("Please enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+name+" Welcome to the Grand Opening Ceremony"); */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of People in the room and People in Queue:  ");
        int ppl_in_room=sc.nextInt();
        int ppl_in_Que=sc.nextInt();

        int sum=0;
        sum=100-ppl_in_room;
        int j=1;

            for (int i = 0; i < ppl_in_Que; i++)
            {
                if( j <= sum)
                {
                    System.out.print(" can fit`<br> ");
                    j++;
                }
                else
                System.out.print(" can't fit`<br> ");

            }

        }



}

