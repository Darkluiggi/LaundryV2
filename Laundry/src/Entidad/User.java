package Entidad;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table (name="Users")
public class User extends Person implements Serializable  {
    private String userName;
    private String password;
       
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
}
