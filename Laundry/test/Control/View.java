/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leons
 */
public class View {
    
    public View() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

       @Test
    public void initData() {
    
        DAOUser dao= new DAOUser();
        
        ArrayList <User> users =new ArrayList<User>();
        
        User a= new User();
        User b= new User();
        User c= new User();
        User d= new User();
        
        a.setUserName("juan");
        a.setPassword("1234");
        a.setRole("Encargado de cabina");
        b.setUserName("pedro");
        b.setRole("Administrador");                 //administrador
        b.setPassword("123");
        c.setUserName("maria");
        c.setPassword("12345");
        c.setRole("Encargado de cabina");
        users.add(a);
        users.add(b);
        users.add(c);
       
    
        for (User u : users ){
            d= dao.read(u);
            System.out.println(d.getUserName());
            System.out.println(d.getPassword());
            if(d.getRole().equals("Administrador")){
                System.out.println("Administrador");
            }
            else {
                System.out.println("Encargado de Cabina");
            }
           System.out.println("-------------");
            dao.read(u);
            
        }
    }
}