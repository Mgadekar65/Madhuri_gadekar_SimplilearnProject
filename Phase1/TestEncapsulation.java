package core.programs.assissted.project;


public class TestEncapsulation 
{     
public static void main (String[] args)  
{ 
    Encapsulate obj = new Encapsulate(); 
    obj.setName("Madhu"); 
    obj.setAge(20); 
    obj.setRoll(61); 
    System.out.println("My name: " + obj.getName()); 
    System.out.println("My age: " + obj.getAge()); 
    System.out.println("My roll: " + obj.getRoll());      
} 
}
