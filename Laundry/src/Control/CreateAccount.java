/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author leons
 */
public class CreateAccount {
    
    private static DAOUser dao = new DAOUser();
    
    public CreateAccount() {
    }
    public static void createAdmin(){
                 
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
    
    public static void createUser(JTextField nameTF, JTextField lastNameTF,JTextField userNameTF,
            JTextField countryTF, JTextField adressTF,JTextField passwordTF,JTextField phoneTF,JCheckBox adminC){
      
      User user = new User();
      user.setName((String)nameTF.getText());
      user.setLastName((String)lastNameTF.getText());
      user.setUserName((String) userNameTF.getText());
      user.setCountry((String)countryTF.getText());
      user.setAdress((String) adressTF.getText());
      user.setPassword((String) passwordTF.getText());
      user.setPhone((String) phoneTF.getText());
      if(adminC.isSelected() == Boolean.TRUE){
          user.setRol("Administrador");
      }else{
          user.setRol("Encargado de cabina");
      }
            
      dao.create(user); 
    }
    public static void updateUser(User usera, User userb, JTextField nameTF, JTextField lastNameTF,JTextField userNameTF,
            JTextField countryTF, JTextField adressTF,JTextField passwordTF,JTextField phoneTF,JCheckBox adminC){
        
        userb.setName(nameTF.getText());
        userb.setLastName(lastNameTF.getText());
        userb.setUserName(userNameTF.getText());
        userb.setCountry(countryTF.getText());       
        userb.setPhone(phoneTF.getText());
        userb.setAdress(adressTF.getText());
        userb.setPassword(passwordTF.getText());
        if(adminC.isSelected() == Boolean.TRUE){
          userb.setRol("Administrador");
      }else{
          userb.setRol("Encargado de cabina");
      }
        dao.update(usera, userb);
    }
    
    }

