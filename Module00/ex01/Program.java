package ex01;
import java.util.Scanner;

public class Program {

    public static boolean is_prime(Long num)
    {
        if (num <= 1)
        {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        int tries = 0;
        for ( int i = 2; tries++ >= 0 &&  i * i <= num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("false " + tries);
                return false;
            }
        }
        System.out.println("true " + tries);
        return true;
    }


    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Long number = Long.parseLong(input);
        is_prime(number);    
    }    
}
