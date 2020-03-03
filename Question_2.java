package assignment_2;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[20];
        int[] prime = new int[20];
        for(int i = 0; i<(number.length);i++) 
        {
        System.out.print("Enter value no. " + i+1 + ":");
        number[i] = input.nextInt();
        for(int j = 2; j<=number[i]/2; ++j)
        {
         if(number[i]%j == 0)
         {
             prime[i] = 0;
             break;
         }
         else 
         {
             prime[i] = number[i];
         }
        }
        if(number[i] == 1 || number[i] == 2 || number[i] == 3)
        {
            prime[i] = number[i];
        }
        }
        System.out.println("The prime numbers are: ");
        for(int i = 0; i<number.length;i++)
        {
            if(prime[i] == 0)
            {
                
            }
            else
            System.out.print(prime[i] + " ");
        }
    }
}
