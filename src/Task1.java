import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)
    {

        System.out.println("Hello User, Good Day!!!");
        System.out.println("Please enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+name+" Welcome to the Grand Opening Ceremony");

        System.out.println("Enter the number of People in the room and People in Queue:  ");
        int ppl_in_room=sc.nextInt();
        int ppl_in_Que=sc.nextInt();

        int total=100;
        int sum=0;
        sum=100-ppl_in_room;
        if (ppl_in_Que > sum)
            System.out.println("Can't fit");
        else
            System.out.println("Can fit");



    }
}
