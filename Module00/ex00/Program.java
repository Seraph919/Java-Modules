package ex00;

public class Program{

    public static int sumOfString(String str)
    {
        int sum = 0;
        for ( char c : str.toCharArray())
        {
            if (Character.isDigit(c))
                sum += (((int)c)) - 48;
        }
        return sum;
    }

    public static void main(String[] args){
    String number = "479598";
    System.out.print(sumOfString(number));
  } 
}
