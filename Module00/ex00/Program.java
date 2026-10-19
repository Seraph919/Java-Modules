package ex00;

public class Program{
    
    final static Long TEST_NUMBER = 479598L;

    public static int sumOfNumbers(Long  num)
    {
        if (num == 0)
            return 0;
        int sum = 0;

        while (num > 0)
        {
            Long dig = num % 10;
            num /= 10;
            sum += dig;
        }
        
        return sum;
    }

    public static void main(String[] args){
    System.out.print(sumOfNumbers(TEST_NUMBER));
  } 
}
