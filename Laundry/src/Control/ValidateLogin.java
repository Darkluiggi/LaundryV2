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
public class ValidateLogin {
    //private Sistema sistema = formularioFramePrincipal.sistema;
    
    private DAOUser dao = new DAOUser();
    
    public ValidateLogin() {
    }
    public String verificarLogin (User user){
        if (!verificarLongitudNombre(user.getUserName())){
            return("Longitud nombre incorrecta");
        }
        if (!verificarLongitudPassword(user.getPassword())){
            return("Longitud contraseña incorrecta");
        }

        if(dao.read(user) != null){
            return ("Bienvenido");
        }
        
        return("Datos Incorrectos");
    }
    
    public boolean verificarLongitudNombre(String nombre){
        return (nombre.length() >1 && nombre.length() <= 6);
        
    }
    public boolean verificarLongitudPassword(String password){
        return (password.length() >=3 && password.length() < 6);
    }
    
}
