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

/**
 *
 * @author leons
 */
public class Initialization {
    
    public Initialization() {
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
        
        a.setUserName("juan");
        a.setPassword("1234");
        a.setRol(Boolean.FALSE);
        b.setUserName("pedro");
        b.setRol(Boolean.TRUE);                 //administrador
        b.setPassword("123");
        c.setUserName("maria");
        c.setPassword("12345");
        c.setRol(Boolean.FALSE);
        
        users.add(a);
        users.add(b);
        users.add(c);
    
    
        for (User u : users ){
            System.out.println(u.getUserName());
            System.out.println(u.getPassword());
            System.out.println("-------------");
            dao.create(u);
            
        }
    }
}
