package assignment_2;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int res = 0;
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                    System.out.print("Enter values for matrix in position " + i + " x " + j + ":");
                    int inp = input.nextInt();
                    res = res + inp;
                matrix[i][j] = inp;
            }
        }
        System.out.println("The diagonal matrix is: ");
        System.out.println("[" + " " + matrix[0][0] + " " + matrix[1][1] + " " + matrix[2][2] + " " + "]");
        res = res - (matrix[0][0]+matrix[1][1]+matrix[2][2]);
        System.out.print("The sum of lower and upper diagonals is: " +res);
        System.out.println("");
    }
}
