package Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class EncapsulationExample {
    public static void main(String[] args) {
        /* Circle c1 = new Circle();
        System.out.println(c1.area(12)); */
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Person> people = new ArrayList<>();

        /* for(int i=1;i<=2;i++){
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
    
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
    
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
    
            System.out.println("-----------");
    
            Person person = new Person(name, email, phone);
            people.add(person);
        } */

        people.add(new Person("Sagar", "sagar@gmail.com", "1231231232"));
        people.add(new Person("Milind", "milind@gmail.com", "1010101010"));

        System.out.println(people.get(0).getPersonData());
        
        
    }
}
