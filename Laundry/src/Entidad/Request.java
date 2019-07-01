/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table (name="Request")
public class Request implements Serializable {

    @Id
    private int id;
    
    @ManyToMany(targetEntity = Article.class)
    private Set articleSet;
    
    @ManyToOne
    private Cabin cabin;

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Set getArticleSet() {
        return articleSet;
    }

    public void setArticleSet(Set articleSet) {
        this.articleSet = articleSet;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
