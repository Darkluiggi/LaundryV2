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
        User b = new User();
        User c = new User();
        a.setUserName("admin");
        a.setRole("Administrador");                 //administrador
        a.setPassword("12345");
        b.setUserName("Fernando");
        b.setRole("Encargado de Cabina");                 //administrador
        b.setPassword("12345");
//        dao.create(b);
       int f;
       f=dao.findID(b);
//       c=dao.readb(f);
       System.out.println("el id es: " + f);
//       System.out.println("el usurio es: " + c.getUserName());
//        if(dao.reada(a) == null){
//           dao.create(a);
//        }
}
     
}
