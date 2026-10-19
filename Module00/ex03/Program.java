package ex03;

import static ex02.Program.isNumeric;
import java.util.HashMap;
import java.util.Scanner;

public class Program {


    public static class Parser{
        
        public static HashMap<String, String> weeks = new HashMap<String, String>();
        public static void addWeek(String Week, String grades)
        {
            try{
                if (isNumeric(grades) == false)
                    throw new RuntimeException("Grades should be numeric");
                weeks.put(Week, grades);
            }
            catch (Exception e)
            {
                System.err.println(e.getMessage());
            }
        }

    }

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        
        scanner.close();

    }
}
