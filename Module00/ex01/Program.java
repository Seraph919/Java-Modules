package ex01;
import java.util.Scanner;

public class Program {

    public static class Condition{
        int tries;
        boolean state;

        Condition()
        {
            tries = 0;
            state = false;
        }

        Condition(int tries, boolean state)
        {
            this.tries = tries;
            this.state = state;
        }

        public void setState(boolean state) {
            this.state = state;
        }

        public void setTries(int tries) {
            this.tries = tries;
        }

        public int getTries() {
            return tries;
        }
        public boolean getState(){
            return state;
        }
    }

    public static Condition is_prime(Long num)
    {
        if (num <= 1)
        {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        Condition cond = new Condition();
        int tries = 0;
        for ( int i = 2; tries++ >= 0 &&  i * i <= num; i++)
        {
            if (num % i == 0)
            {
                cond.setState(false);
                cond.setTries(tries);
                return cond;
            }
        }
        cond.setState(true);
        cond.setTries(tries);
        return cond;
    }


    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Long number = Long.parseLong(input);
        Condition cond = is_prime(number);
        System.err.println(cond.getState() + " " + cond.getTries());
        scanner.close(); 
    }    
}
