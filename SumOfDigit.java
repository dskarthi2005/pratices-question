import java.util.*;
public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value is: ");
        int n = sc.nextInt();

        int Sum= 0, temp=n; 
       
        while (temp > 0) 
        {
            int digit= (temp%10);
            Sum+=digit;
            temp /= 10;
             
        }
       System.out.println("The sum of Value is: "+Sum);
        }
    }