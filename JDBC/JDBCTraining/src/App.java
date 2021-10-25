import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        CRUDOperations op = new CRUDOperations();
        try{
            // User u1 = new User("Vishal Sahal", "vishal@gmail.com", "12122343454");
            // op.insertUser(u1);
            ArrayList<User> fetchedUser = op.getAllUser();
            
            for (User user : fetchedUser) {
                System.out.println(user.toString());
            }
           
        }
        catch(SQLException e){
            
        }
        
    }
}