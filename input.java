import java.util.Scanner;

class input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[] array = new int[5];
        
        System.out.println("Enter Array with 5 elements: \n");
        
        for(int i=0; i<5; i++)
        {
            array[i] = input.nextInt();
        }
        
        System.out.println(" \n\n "); 
        
        for(int j=0; j<5; j++)
        {
            while(j==3)
            {
                j++;
                continue;
            }
            System.out.println(array[j]);
        }
    }
}