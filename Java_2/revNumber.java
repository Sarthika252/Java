import java.util.*;
public class revNumber {

  
    public static void main(String[] args) {
    
    
        int remainder;
        int result = 0; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse it:");
        int n=sc.nextInt();
                      while(n>0){
              remainder = n%10;
              result = result * 10 + remainder;
              n = n/10;
         }
      System.out.println("Reversed number is :"+result);
    }

        
}