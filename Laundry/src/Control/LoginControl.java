/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;

/**
 *
 * @author leoleguizamon
 */
public class LoginControl {
    //private Sistema sistema = formularioFramePrincipal.sistema;
    
    private DAOUser dao = new DAOUser();
    private User log = new User();
               
    public LoginControl() {
        
    }
    public String verifyLogin (User user){
        if (!verifyNameLength(user.getUserName())){
            return("Longitud nombre incorrecta");
        }
        if (!verifyPasswordLength(user.getPassword())){
            return("Longitud contraseña incorrecta");
        }
        int a = dao.findID(user);
        if(dao.read(a)!= null){
            log = dao.read(a);
            if(log.getRole().equals("Administrador") ){
            return ("Administrador");
            }else{
                if(log.getRole().equals("Encargado de cabina") ){
                return ("Encargado de cabina");
            }
          }
        }
        
        return("Datos Incorrectos");
    }
    
    public boolean verifyNameLength(String name){
        return (name.length() >1 && name.length() <= 8);
        
    }
    public boolean verifyPasswordLength(String password){
        return (password.length() >=3 && password.length() < 8);
    }
    
}
