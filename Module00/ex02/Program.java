package ex02;

import static ex00.Program.sumOfNumbers;
import static ex01.Program.is_prime;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.chars().allMatch(c -> Character.isDigit(c) || c == ' ');;
    }


    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        try{
            ArrayList<String> input = new ArrayList<String>();
            while (true)
            {
                if (scanner.hasNextLine() == false)
                    break;
                String line  = scanner.nextLine();
                if (isNumeric(line))
                {
                    if (line.equals("42"))
                        break;
                    input.add(line);
                }
                else
                    throw new RuntimeException("invalid input");
            }
            int sum = 0;
            for (String string : input)
                if (is_prime((long) sumOfNumbers(string)).getState() == true)
                    sum++;
            System.out.println("Count of coffee-request : " + sum);
        }
        catch (Exception e) {
            System.err.println(e.getMessage()); 
        }
        scanner.close();
    }
}
