/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
import Utils.PanelUtils;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author leons
 */
public class ManageAccount {
    
    private static DAOUser dao = new DAOUser();
    
    public ManageAccount() {
    }
    public static void createAdmin(){
                 
        DAOUser dao= new DAOUser();
       
        
        User a = new User();
                     
        a.setUserName("admin");
        a.setRole("Administrador");                 //administrador
        a.setPassword("12345");
                    
        if(dao.findID(a) == -1){
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
          user.setRole("Administrador");
      }else{
          user.setRole("Encargado de cabina");
      }
            
      dao.create(user); 
    }
    public static void updateUser(User userA, JTextField nameTF, JTextField lastNameTF,JTextField userNameTF,
            JTextField countryTF, JTextField adressTF,JTextField passwordTF,JTextField phoneTF,JCheckBox adminC){
        
        int a=dao.findID(userA);
        userA=dao.read(a);
        userA.setName(nameTF.getText());
        userA.setLastName(lastNameTF.getText());
        userA.setUserName(userNameTF.getText());
        userA.setCountry(countryTF.getText());       
        userA.setPhone(phoneTF.getText());
        userA.setAdress(adressTF.getText());
        userA.setPassword(passwordTF.getText());
        if(adminC.isSelected() == Boolean.TRUE){
          userA.setRole("Administrador");
      }else{
          userA.setRole("Encargado de cabina");
      }
        dao.update(userA);
    }
    
    public static void findUser(User userA, JTextField findIdTF,JTextField editNameTF, JTextField editLastNameTF,   JTextField editUserNameTF ,JTextField editPassTF, JTextField editCountryTF,
                                    JTextField editPhoneTF,JTextField editAdressTF, JCheckBox editAdminC,JPanel editUserActualPanel, 
                                    JPanel editUserErrorPanel,JPanel editPanel, JLabel idEditLabel,JLabel buscarErrorLabel){
        
        userA.setUserName(findIdTF.getText());
        int a=dao.findID(userA);
        userA=dao.read(a);
        if(userA==null){
            PanelUtils.change(editUserActualPanel, editUserErrorPanel);
             buscarErrorLabel.setText(findIdTF.getText());
            }else{        
        editNameTF.setText(userA.getName());
        editLastNameTF.setText(userA.getLastName());
        editUserNameTF.setText(userA.getUserName());
        editPassTF.setText(userA.getPassword());
        editCountryTF.setText(userA.getCountry());
        editPhoneTF.setText(userA.getPhone());
        editAdressTF.setText(userA.getAdress());
        if(userA.getRole().equals("Administrador")){
          editAdminC.setSelected(Boolean.TRUE);
      }else{
          editAdminC.setSelected(Boolean.FALSE);
      }
        PanelUtils.change(editUserActualPanel, editPanel);
        idEditLabel.setText(findIdTF.getText());
    }
    
    }
}


