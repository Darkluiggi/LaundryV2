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
public class Update {
    
    public Update() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void initData() {
    
        DAOUser dao= new DAOUser();
        
        ArrayList <User> usersa =new ArrayList<User>();
        ArrayList <User> usersb =new ArrayList<User>();
        
        User a= new User();
        User b= new User();
        User c= new User();
        User d= new User();
        User e= new User();
        User f= new User();
       
        
        a.setUserName("juan");
        a.setPassword("1234");
        a.setRole("Encargado de cabina");
        b.setUserName("pedro");
        b.setRole("Administrador");                 //administrador
        b.setPassword("123");
        c.setUserName("maria");
        c.setPassword("12345");
        c.setRole("Encargado de cabina");
        a.setUserName("carlos");
        a.setPassword("12345");
        a.setRole("Administrador");
        b.setUserName("jose");
        b.setRole("Encargado de Cabina");                 //administrador
        b.setPassword("12356");
        c.setUserName("fernanda");
        c.setPassword("123457");
        c.setRole("Administrador");
       
//        usersa.add(a);
//        usersa.add(b);
//        usersa.add(c);
        
    
    
             dao.update(a);
             dao.update(b);
             dao.update(c);
           for (User u : usersb ){
            a= dao.read(u);
            System.out.println(a.getUserName());
            System.out.println(a.getPassword());
            if(a.getRole().equals("Administrador")){
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

