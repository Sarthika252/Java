import java.util.*;
public class ListArrayList
{
 public static void main(String[] args)
 {
  ArrayList <String> name=new ArrayList<String>();
 name.add("Pinku");
 name.add("Seeta");
 name.add("geeta");
 name.add("sara");
 name.add("ved");
 System.out.println(name);
Iterator it =name.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}