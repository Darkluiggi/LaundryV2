/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
import java.util.ArrayList;

/**
 *
 * @author leoleguizamon
 */
public class ValidateLogin {
    //private Sistema sistema = formularioFramePrincipal.sistema;
    
    private DAOUser dao = new DAOUser();
    private User log = new User();
               
    public ValidateLogin() {
        
    }
    public String verifyLogin (User user){
        if (!verifyNameLength(user.getUserName())){
            return("Longitud nombre incorrecta");
        }
        if (!verifyPasswordLength(user.getPassword())){
            return("Longitud contraseña incorrecta");
        }

        if(dao.readLogin(user)!= null){
            log=dao.readLogin(user);
            if(log.getRol().equals("Administrador") ){
            return ("Administrador");
            }else{
                if(log.getRol().equals("Encargado de cabina") ){
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
