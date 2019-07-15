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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author leons
 */
public class ManageAccount implements Controller{
    
    private static DAOUser daoU = new DAOUser();
    private static User temp = new User();
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
            
      daoU.create(user); 
    }
    public static void updateUser( JTextField nameTF, JTextField lastNameTF,JTextField userNameTF,
            JTextField countryTF, JTextField adressTF,JTextField passwordTF,JTextField phoneTF,JCheckBox adminC){
        
        
       
        temp.setName(nameTF.getText());
        temp.setLastName(lastNameTF.getText());
        temp.setUserName(userNameTF.getText());
        temp.setCountry(countryTF.getText());       
        temp.setPhone(phoneTF.getText());
        temp.setAdress(adressTF.getText());
        temp.setPassword(passwordTF.getText());
        if(adminC.isSelected() == Boolean.TRUE){
          temp.setRole("Administrador");
      }else{
          temp.setRole("Encargado de cabina");
      }
        daoU.update(temp);
    }
    public static void TableClicked(JTextField nameTF, JTextField lastNameTF,JTextField userNameTF, JTextField countryTF,
            JTextField adressTF,JTextField phoneTF, JTextField passwordTF, JTable userTable) {
        
        nameTF.setText("Nombre");
        lastNameTF.setText("Apellido");
        userNameTF.setText("Nombre de Usuario");
        countryTF.setText("Pais");
        adressTF.setText("Direccion");
        phoneTF.setText("Telefono");
        passwordTF.setText("Contraseña");
        
        String a,b;
        
        a= (String)userTable.getValueAt(userTable.getSelectedRow(), 0);
        b= (String)userTable.getValueAt(userTable.getSelectedRow(), 1);
        
        temp=daoU.read(userTable.getSelectedRow()+1);
        nameTF.setText(temp.getName());
        lastNameTF.setText(temp.getLastName());
        userNameTF.setText(temp.getUserName());
        countryTF.setText(temp.getCountry());
        adressTF.setText(temp.getAdress());
        phoneTF.setText(temp.getPhone());
        passwordTF.setText(temp.getPassword());
        
        
    }
    
    
    public static void findUser(User userA, JTextField findIdTF,JTextField editNameTF, JTextField editLastNameTF,   JTextField editUserNameTF ,JTextField editPassTF, JTextField editCountryTF,
                                    JTextField editPhoneTF,JTextField editAdressTF, JCheckBox editAdminC,JPanel editUserActualPanel, 
                                    JPanel editUserErrorPanel,JPanel editPanel, JLabel idEditLabel,JLabel buscarErrorLabel){
        
        userA.setUserName(findIdTF.getText());
        int a=daoU.findID(userA);
        userA=daoU.read(a);
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

    @Override
    public void executeCallBack(Runnable callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


