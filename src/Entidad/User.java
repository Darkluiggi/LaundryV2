package Entidad;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table (name="Users")
public class User extends Person implements Serializable  {
    @Column(unique = true)
    private String userName;
    
    private String password;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public User() {
    }

    public User(String name, String lastName) {
        super(name, lastName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
