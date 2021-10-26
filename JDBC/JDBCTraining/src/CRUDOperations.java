import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDOperations {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/core_java_training?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123123";
    private static final String INSERT_USER_QUERY = "INSERT INTO users(full_name, email, phone) VALUES(?, ?, ?)";
    private static final String GET_ALL_USERS_QUERY = "SELECT * FROM users";
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE users SET full_name=?, email=?, phone=? WHERE id=?";
    protected Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.jdbcUrl, this.jdbcUsername, this.jdbcPassword);
        }
        catch(ClassNotFoundException e){
            // Perticula msg to user
        }
        catch(SQLException e){
            // Some sql exception related msg to user
        }
        catch(Exception e){
            // Some generic msg
        }

        return con;
    }

    public void insertUser(User newuser) throws SQLException{
        try(Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_USER_QUERY)){
            ps.setString(1, newuser.getFullname());
            ps.setString(2, newuser.getEmail());
            ps.setString(3, newuser.getPhone());
            System.out.println(ps);
            ps.executeUpdate();
        }
        catch(SQLException e){

        }
    }

    public ArrayList<User> getAllUser() throws SQLException{
        ArrayList<User> users = new ArrayList<>();
        try(Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(GET_ALL_USERS_QUERY)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String fullname = rs.getString("full_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                User tempUser = new User(id, fullname, email, phone);
                users.add(tempUser);
            }
        }
        catch(SQLException e){

        }
        return users;
    }

    /* // Complete by yourself
    public User getOneUser(int id){
        return new User();
    } */

    public boolean deleteUser(int id) throws SQLException{
        try(Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_USER_QUERY)){
            ps.setInt(1, id);
            boolean isDeleted = ps.executeUpdate() > 0;
            if(isDeleted){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            return false;
        }
    }

    public boolean updateUser(User userToUpdate) throws SQLException{
        try(Connection con = this.getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_USER_QUERY)){
            ps.setString(1, userToUpdate.getFullname());
            ps.setString(2, userToUpdate.getEmail());
            ps.setString(3, userToUpdate.getPhone());
            ps.setInt(4, userToUpdate.getId());
            boolean isUpdated = ps.executeUpdate() > 0;
            if(isUpdated){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException e){
            return false;
        }
    }
}
