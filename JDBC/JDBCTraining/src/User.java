public class User {
    private int id;
    private String fullname, email, phone;

    public User(String fullname, String email, String phone) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    public User(int id, String fullname, String email, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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


    public String toString(){
        return "ID: "+this.id+"\nFull Name: "+this.fullname+"\nEmail: "+this.email+"\nPhone: "+this.phone;
    }

    
}
