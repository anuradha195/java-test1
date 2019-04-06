import java.util.Scanner;

public class Task5
{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int sum = 0;
        String new_number = number.replaceAll("[^0-9]", "");
        System.out.println(new_number);

        for (int i = 0; i < new_number.length()-1; i++) {
            char digit1 = new_number.charAt(i);
            int digitAsInt1 = (int) digit1 - 48;
            char digit2 = new_number.charAt(i+1);
            int digitAsInt2 = (int) digit2 - 48;

                if (digitAsInt1 == digitAsInt2) {
                    sum += digitAsInt1;
                    // System.out.println("Sum : " +sum);
                    i++;
                }

            }
        if ( sum ==0)
            System.out.print("no change");

        System.out.println(sum);
    }


}

