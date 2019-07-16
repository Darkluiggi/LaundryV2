/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOArticle;
import DAO.DAOArticleRequest;
import com.sun.org.apache.xerces.internal.xs.StringList;
import java.util.List;
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
public class finrequesttest {
    
    public finrequesttest() {
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

    private DAOArticleRequest dao = new DAOArticleRequest();
    @Test
    public void hello() {
        List<String> list ;
        list=dao.findIds();
        System.out.println(list);
    
    
   
    }
}
