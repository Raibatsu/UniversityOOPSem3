package assignment_2;
import java.util.Scanner;
public class Question_3 {
        public static void main(String[] args)
        {
            Question_3 obj = new Question_3();
            int pos;
            Scanner input = new Scanner(System.in);
            int count = 0; int var;
            System.out.print("Enter number of inputs: ");
            int n = input.nextInt();
            int[] value = new int[n];
            int[] rand = new int[n];
            for(int i=0; i<n;i++)
            {
                System.out.print("Enter value no. " + (i+1) + ")");
                value[i] = input.nextInt();
             rand[i] = (int)(Math.random()*10);
            }
            System.out.println("The following elements are stored in the computer, though not in the order that is displayed: ");
            for(int i=0; i<value.length;i++){           
            for(int j=0; j<rand.length;j++)
            {
                if(rand[i] == rand[j])
                {
                    break; 
                }
            else
                {
                System.out.print(value[rand[i]] + " ");
                count = count+1;
                i--;
                break;   
                }

                }
                            if(count == n)
                {
                    break;
            }
            }
            System.out.println("Which element do you wish to search for?");
            var = input.nextInt();
            int result = obj.search(value, 0, value.length-1, var); 
            if(result == 99)
            {
                System.out.println("The element does not exist.");
            }
            else
            System.out.println("The element is stored in location: " + result);
            
         }  
       public int search(int value[], int lower, int upper, int var) 
    { 
        if (upper >= lower) 
        { 
            int middle = lower + (upper - lower) / 2; 
            if (value[middle] == var) 
            {
                return middle; 
            }
            
            if (value[middle] > var) 
            {
                return search(value, lower, middle-1, var); 
            }
            
            return search(value, middle+1, upper, var); 
        } 
        return 99; 
    } 
        }
       
