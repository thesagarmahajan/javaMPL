import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collections {
    public static void main(String[] args) {

        HashMap<String, Object> person1 = new HashMap<>();
        person1.put("full_name", "Sagar Mahajan");
        person1.put("email", "sagar@gmail.com");
        person1.put("age", 26);
        person1.put("married", false);
        person1.put("height", 5.6f);

        HashMap<String, Object> person2 = new HashMap<>();
        person2.put("full_name", "Ninad Ghangrekar");
        person2.put("email", "ninad@gmail.com");
        person2.put("age", 26);
        person2.put("married", false);
        person2.put("height", 5.5f);

        ArrayList<HashMap<String, Object>> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        // for(int i=0;i<people.size();i++){
        //     System.out.println(people.get(i));
        // }

        for (HashMap<String,Object> person : people) {

            for (Entry<String, Object> kv : person.entrySet()) {

                System.out.println(kv.getValue());

            }
            
        }
    }   
}