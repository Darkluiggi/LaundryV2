/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOUser;
import Entidad.User;
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
public class findIdTest {
    
    public findIdTest() {
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
       
        
        User a = new User();
       
        
        a.setUserName("Fernando");
        a.setRole("Encargado de cabina");                 //administrador
        a.setPassword("12345");
        dao.create(a);
        
       int f;
       f=dao.findID(a);
       a=dao.read(f);
       System.out.println("el id es: " + f);
       System.out.println("el usurio es: " + a.getUserName());

}
     
}
