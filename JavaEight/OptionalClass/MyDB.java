package JavaEight.OptionalClass;

import java.util.ArrayList;
import java.util.Optional;
import Encapsulation.Person;


public class MyDB {
    private ArrayList<Person> people = new ArrayList<>();

    public void addUser(Person newPeron){
        this.people.add(newPeron);
    }

    public Optional<Person> findUserById(int id){
        return this.people.stream().filter(person -> person.getId()==id).findFirst();
    }
}
