package JavaEight.OptionalClass;
import java.util.Optional;
import Encapsulation.Person;

public class OptionalClassExample {
    public static void main(String[] args) {
        Person p1 = new Person("Sagar", "sagar@gmail", "1231231232");
        Person p2 = new Person("Vishal", "vishal@gmail.com", "1919191919");
        
        MyDB db = new MyDB();
        db.addUser(p1);
        db.addUser(p2);

        Optional<Person> foundPerson = db.findUserById(1);
        if(foundPerson.isEmpty()){
            System.out.println("NO USER FOUND");
        }
        else{
            Person ActuallyFoundPerson = foundPerson.get();
            System.out.println(ActuallyFoundPerson.getPersonData());
        }
    }
}
