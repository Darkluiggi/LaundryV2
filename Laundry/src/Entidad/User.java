package Entidad;

public class User {
    private String userName;
    private String password;
    private Boolean rol;
    private int ID;
    
    
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
