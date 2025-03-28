import java.io.*;
import java.util.*;
public class Stack1{
static final int MAX=100;
int top=-1;
int[] stack=new int[MAX];
public static void main(String args[])
{
    Stack1 s1=new Stack1();
        int opt, val;
        System.out.println("1. PUSH ");
        System.out.println("2. POP ");
        System.out.println("3. PEEK ");
        System.out.println("4. DISPLAY STACK ");
        System.out.println("5. EXIT ");
        
    do{
       System.out.println("\n Enter Your Option: ");
        Scanner s=new Scanner(System.in);
        opt=s.nextInt();

        switch(opt)
        {
            case 1: System.out.println("Enter the value to be added to the stack: ");
                    val=s.nextInt();
                    s1.push(val);
                    break;
            case 2: s1.pop();
                    break;
                
            case 3: s1.peek();
                    break; 
            case 4: s1.display();
                    break;
        }
    }while(opt!=5);
}
public void push(int val)
{
    if(top==MAX)
    {
        System.out.println("Stack is FULL!");
    }
    else
    {
        top++;
        stack[top]=val;
        System.out.println("Element added to the stack is: "+val);
        
    }
}
public void pop()
{
    int x;
    if(top==-1)
    {
        System.out.println("Stack is EMPTY!");
    }
    else
    {
        x=stack[top];
        System.out.println("The element deleted from the stack is: "+x);
        top--;
        
    }
}
public void peek()
{
    int n;
    n=stack[top];
    System.out.println("The value at the top of the stack is: "+n);
}
public void display()
{
    int i;
    if(top==-1)
    System.out.println("STACK IS EMPTY!");
    else
    {
        for(i=0; i<=top; i++)
        System.out.println("The elements in the stack are: "+stack[i]);
    }
}
}