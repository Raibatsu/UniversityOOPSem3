package assignment_2;
import java.util.Scanner;

public class Question_5 {
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int[][] matrix = new int[5][5];
int sum_row = 0, sum_column = 0;
int total_sum = 0;
int res = 0;
        for(int i=0; i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                    System.out.print("Enter values for matrix in position " + (i+1) + " x " + (j+1) + ":");
                    int inp = input.nextInt();
                    res = res + inp;
                matrix[i][j] = inp;
            }
        }
        System.out.println("________________________________________________");
for(int j=0;j<5;j++) 
{
        for(int i=0;i<5;i++)
{
    sum_row = sum_row + matrix[j][i];
    sum_column = sum_column + matrix[i][j];

}
    System.out.println("Sum of column " + (j+1) + "'s rows is:    " + sum_row);
    System.out.println("Sum of row " + (j+1) + "'s columns is:    " + sum_column);
    total_sum = sum_row + sum_column;
    sum_column = sum_row = 0;
}
    System.out.println("The total sum of all rows into columns is: " + total_sum);
}  
}