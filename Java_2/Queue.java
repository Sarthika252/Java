import java.io.*;
class Queue
{
    static int i,front,rear,item,max=10,ch;
    static int a[]=new int[10];
    Queue()
    {
        front=-1;
        rear=-1;
    }
    public static void main(String args[])throws IOException
    {

        while((boolean)true)
        {
            try
            {
                System.out.println("Select Option 1.Enqueue 2.Dequeue 3.Display 4.Exit");
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {    }
            if(ch==4)
                break;
            else
            {
                switch(ch)
                {
                case 1:
                    Enqueue();
                    break;
                case 2:
                    Dequeue();
                    break;
                case 3:
                    Display();
                    break;
                }
            }
        }
    }
    static void Enqueue()
    {
        if(rear>=max)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            try
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the Element: ");
                item=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {}
            rear=rear+1;
            a[rear]=item;
        }
    }
    static void Dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            front=front+1;
            item=a[front];
            System.out.println("Deleted Item: "+item);
        }
    }
    static void Display()
    {
        System.out.println("Elements in the Queue are:");
        for(int i=front+1; i<=rear; i++)
        {
            System.out.println(a[i]);
        }
    }
}
