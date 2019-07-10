/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ArticleRequest")
public class ArticleRequest implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn
    private Article article;

    @Id
    @ManyToOne
    @JoinColumn
    private Request request;

    @Column
    private int quantity;
    
    @Column 
    private double subtotal;

    public ArticleRequest() {
    }
    
    public ArticleRequest(Article article, int quantity, double subtotal){
        this.article = article;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArticleRequest)) return false;
        ArticleRequest that = (ArticleRequest) o;
        return Objects.equals(article.getClothName(), that.article.getClothName()) &&
                Objects.equals(request.getId(), that.request.getId()) &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article.getClothName(), request.getId(), quantity);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    

}
