import java.util.*;
public class GFG
{
 public static void main(String[] args)
{
 TreeSet<String> animal= new TreeSet<String>();
 animal.add("Dog");
 animal.add("Tiger");
 animal.add("Lion");
 animal.add("Fox");
 animal.add("Rabbit");
 System.out.println(animal);
 System.out.println(animal.descendingSet());
  System.out.println(animal.pollFirst());
 System.out.println(animal.pollLast());
System.out.println(animal.headSet("Lion"));
 System.out.println(animal.tailSet("Fox"));
 }
}