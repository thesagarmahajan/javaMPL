package Encapsulation;

import java.util.HashMap;

public class Person {

    private String name, email, phone;
    private int id;
    private static int idGenerator = 0;

    public Person(String newName, String newEmail, String newPhone) {
        this.name = newName;
        this.email = newEmail;
        this.phone = newPhone;
        this.idGenerator++;
        this.id = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public HashMap<String, Object> getPersonData(){
        HashMap<String, Object> personData = new HashMap<>();
        personData.put("name", this.name);
        personData.put("email", this.email);
        personData.put("phone", this.phone);
        return personData;
    }

    public String toString(){
        return "ID: "+this.id+"\n"
        +"Name: "+this.name+"\n"
        +"Email: "+this.email+"\n"
        +"Phone: "+this.phone+"\n";
    }

}
