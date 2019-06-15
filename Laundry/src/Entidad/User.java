package Entidad;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name="Usuarios")
public class User implements Serializable {
    private String userName;
    private String password;
    private Boolean rol;
    private int ID;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    public int getId(){
        return id;
        
    }
    
    public void setId(int id){
        this.id = id;
        
    }
    public User(){
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    public Boolean getRol(Boolean rol) {
        return rol;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setRol(Boolean rol) {
        this.rol = rol;
    }
    
    
}
