import java.util.Scanner;
public class Sort
{
    public static void main(String[] args) 
    {
    	int count, temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count of numbers you want to sort in ascending order: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter ten elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}