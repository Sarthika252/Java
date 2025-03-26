public class Address{
  String city, state ,country;
 public Address(String city, String state, String country)
   {
    this.city=city;
    this.state=state;
    this.country= country;
   }
}
public class Emp{
 int id;
 String name;
 Address address;

 public Emp(int id, String name, Address address){
 this.id=id;
 this.name=name;
 this.address=address;
}
 void display(){
 System.out.println(id+" "+name);
 System.out.println(address.city+""+address.state+""+address.country);
}     
}

class isa{
public static void main(String[] args){
 Address address1=new Address("abc","UP","India");
 Address address2=new Address("gno","UP","India");

Emp e = new Emp(111,"priya",address1);
Emp e2 = new Emp(112,"Varun",address2);

e.display();
e2.display();
}
}

    


