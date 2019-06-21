package Entidad;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table (name="Users")
public class User implements Serializable {
    
    private String name;
    private String lastName;
    private String userName;
    private String country;
    private String adress;
    private String password;
    private int phone;
    private Boolean rol;
       
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
    public Boolean getRol() {
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

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
