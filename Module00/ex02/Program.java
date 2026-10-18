package ex02;

import ex00.Program;
import ex01.Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        ArrayList<String> input = new ArrayList<String>();
        while (true)
        {
            if (scanner.hasNextLine() == false)
                break;
            
            input.add(scanner.nextLine()); 
        }
        int sum = 0;
        for (String string : input)
            if (is_prime(sumOfString(string)))
                sum++;
        System.out.println("Count of coffee-request : " + sum);
    }
}
