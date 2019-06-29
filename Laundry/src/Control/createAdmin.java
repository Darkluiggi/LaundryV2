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
 * @author leons
 */
public class createAdmin {

    public createAdmin() {
    }
    public static void createA(){
                 
        DAOUser dao= new DAOUser();
       
        
        User a = new User();
        User b = new User();
             
        a.setUserName("admin");
        a.setRol("Administrador");                 //administrador
        a.setPassword("12345");
       
        if(dao.readLogin(a) == null){
            dao.create(a);
        }
            
       }
    }

