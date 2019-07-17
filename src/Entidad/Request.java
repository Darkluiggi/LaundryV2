/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table (name="Request")
public class Request implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToMany(mappedBy = "request", targetEntity = ArticleRequest.class, cascade = CascadeType.PERSIST)
    private Set<ArticleRequest> articleSet;
    
    @ManyToOne
    private Cabin cabin;

        
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;
    
    @Column
    private double total;

    public Request() {
    }
    
    public Request(ArticleRequest... articleRequests) {
        for(ArticleRequest articleRequest : articleRequests) articleRequest.setRequest(this);
        this.articleSet = Stream.of(articleRequests).collect(Collectors.toSet());
    }
    

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Set<ArticleRequest> getArticleSet() {
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
