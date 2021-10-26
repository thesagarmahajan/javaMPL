import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        CRUDOperations op = new CRUDOperations();
        try{
            /* 
            // Inserting one user
            User u1 = new User("Vishal Sahal", "vishal@gmail.com", "12122343454"); 
            op.insertUser(u1);
            */
            
            /* // Selecting and printing all users
            ArrayList<User> fetchedUser = op.getAllUser();
            
            for (User user : fetchedUser) {
                System.out.println(user.toString());
            } */

            /* // Deleting single user using id
            System.out.println(op.deleteUser(1) ? "User Deleted" : "Wrong id"); */

            // Updating user data
            boolean isUpdated = op.updateUser(new User(2, "Milind Mahajan", "milind@gmail.com", "1010101010"));
            System.out.println(isUpdated ? "User Data Updated" : "Wrong ID");
        }
        catch(SQLException e){
            
        }
        
    }
}