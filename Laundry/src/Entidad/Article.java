/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author luaalvarezve
 */
@Entity
@Table (name="Article")
public class Article implements Serializable  {
    
    private String gender;
    private String clothName;
    private float washPrice;
    private boolean washA;
    private float waiPrice;
    private boolean waiA;
    private float ironPrice;
    private boolean ironA;
    private float foldPrice;
    private boolean foldA;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToMany(mappedBy = "article", targetEntity = ArticleRequest.class)
    private Set<ArticleRequest> requestsSet;

    public Set getRequestsSet() {
        return requestsSet;
    }

    public void setRequestsSet(Set requestsSet) {
        this.requestsSet = requestsSet;
    }
     
      public int getId(){
        return id;        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Article(){
    }

    public void setFoldPrice(float foldPrice) {
        this.foldPrice = foldPrice;
    }

    public float getFoldPrice() {
        return foldPrice;
    }

    public String getGender() {
        return gender;
    }

     public String getClothName() {
        return clothName;
    }

    public boolean isWashA() {
        return washA;
    }

    public boolean isWaiA() {
        return waiA;
    }

    public boolean isIronA() {
        return ironA;
    }

    public boolean isFoldA() {
        return foldA;
    }
    
    public float getWashPrice(){
        return washPrice;
    }
    public float getWaiPrice(){
        return waiPrice;
    }
    public float getIronPrice(){
        return ironPrice;
    }
    public Boolean getFold() {
        return foldA;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }
     public void setWashPrice(float washPrice){
        this.washPrice = washPrice;
    }

    public void setWashA(boolean washA) {
        this.washA = washA;
    }

    public void setWaiA(boolean waiA) {
        this.waiA = waiA;
    }

    public void setIronA(boolean ironA) {
        this.ironA = ironA;
    }
    public void setWaiPrice(float waiPrice){
        this.waiPrice=waiPrice;
    }
    public void setIronPrice(float ironPrice){
       this.ironPrice=ironPrice;
    }
    public void setFoldA(boolean foldA) {
        this.foldA=foldA;
    }

}
