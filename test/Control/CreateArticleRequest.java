/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DAOArticle;
import DAO.DAOArticleRequest;
import Entidad.Article;
import Entidad.ArticleRequest;
import Entidad.Request;
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
public class CreateArticleRequest {
    
    public CreateArticleRequest() {
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
            public void initData(){
                
            
    DAOArticleRequest dao= new DAOArticleRequest();
    DAOArticle daoA= new DAOArticle();
        
        ArrayList <ArticleRequest> requests =new ArrayList<ArticleRequest>();
        
        ArticleRequest a= new ArticleRequest();
        ArticleRequest b= new ArticleRequest();
        ArticleRequest c= new ArticleRequest();
        Article d= new Article();
        Request e = new Request();
        e.setId(1);
        d=daoA.read(1);
        a.setArticle(d);
        a.setExpress(Boolean.FALSE);
        a.setFold(Boolean.TRUE);
        a.setQuantity(5);
        a.setService("Lavandería");
        a.setSubtotal(5*d.getWashPrice());
        a.setRequest(e);
        
        
//        b.setArticle("juan");
//        b.setExpress("1234");
//        b.setFold("Encargado de cabina");
//        b.setQuantity("pedro");
//        b.setRequest("Administrador");                 //administrador
//        b.setService("123");
//        b.setSubtotal("maria");
//        c.setArticle("juan");
//        c.setExpress("1234");
//        c.setFold("Encargado de cabina");
//        c.setQuantity("pedro");
//        c.setRequest("Administrador");                 //administrador
//        c.setService("123");
//        c.setSubtotal("maria");
       
        requests.add(a);
//        requests.add(b);
//        requests.add(c);
    
    
        for (ArticleRequest u : requests ){
            System.out.println(u.getArticle());
            System.out.println(u.getQuantity());
            System.out.println(u.getSubtotal());
            
           System.out.println("-------------");

           dao.create(u);
            System.out.println(dao.findAll());
}
            }
}


