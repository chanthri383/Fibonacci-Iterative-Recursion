import java.util.*;

public class algo {

    public static int startValue = 0;
    public static int endValue = 1;
    public static int sum = 0; 
    //the global are for the recursive approach for fibonacci

    public static void recursive(int n,int max) //recursion for fibonacci
    {
        if(n < 0)
        {
            System.out.println("Value cannot be negative");
        }
        else if(n == 0)
        {
            System.out.println("Fibonacci " + max + ": " + sum);
            return;
        }
        else
        {
            sum = startValue + endValue;
            endValue = startValue;
            startValue = sum;
            recursive(n-1, max);
        }
    }

    public static void iterate(int n) //iterative for fibonacci
    {
        int startValue = 0, endValue = 1, sum = 0;

            for(int i = 0; i < n; i++)
            {
                sum = endValue + startValue;
                endValue = startValue;
                startValue = sum;
            }
            System.out.println("Fibonacci: " + n + " is: " + sum);
    }

    //public static void

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int howMany = 0;
        System.out.println("Please enter a number to find fibonacci");
        howMany = scan.nextInt();
        int max = howMany; //maximum value of n
        System.out.print("Recursion Fibonacci: ");
        recursive(howMany, max);

        System.out.println();

        System.out.print("Iteration Fibonacci: ");
        iterate(howMany);


    }
}
