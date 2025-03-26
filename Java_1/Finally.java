import java.io.*;
class ListOfNumbers{
 private int[] list={5,6,8,9,2};
public void writeList(){
 PrintWriter out = null;

try{
System.out.println("Entering try statement");

out= new PrintWriter(new FileWriter("diya.txt"));

for(int i=0;i<7;i++){
 out.println("Value at: " + i + " =" +list[i]);
 }

}

catch(Exception e){
 System.out.println("Exception =>" +e.getMessage());
}
finally{
 if(out != null){
 System.out.println("Closing PrintWriter");
 out.close();
}
else{
 System.out.println("PrintWriter not open.");
}
}
}
class Final{
 public static void main(String args[]){
 ListOfNumbers list=new ListOfNumbers();
 list.writeList();
 }
}




