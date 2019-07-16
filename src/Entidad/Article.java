/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
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
    @Column
    private String gender;
    @Column
    private String clothName;
    @Column
    private double washPrice;
    @Column
    private boolean washA;
    @Column
    private double waiPrice;
    @Column
    private boolean waiA;
    @Column
    private double ironPrice;
    @Column
    private boolean ironA;
    @Column
    private double foldPrice;
    @Column
    private boolean foldA;
    @Column
    private boolean status;
    
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

    public void setFoldPrice(double foldPrice) {
        this.foldPrice = foldPrice;
    }

    public void setWaiA(boolean waiA) {
        this.waiA = waiA;
    }

    public boolean isWaiA() {
        return waiA;
    }

    public double getFoldPrice() {
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


    public boolean isIronA() {
        return ironA;
    }

    public boolean isFoldA() {
        return foldA;
    }
    
    public double getWashPrice(){
        return washPrice;
    }
    public double getWaiPrice(){
        return waiPrice;
    }
    public double getIronPrice(){
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
     public void setWashPrice(double washPrice){
        this.washPrice = washPrice;
    }

    public void setWashA(boolean washA) {
        this.washA = washA;
    }

    public void setIronA(boolean ironA) {
        this.ironA = ironA;
    }
    public void setWaiPrice(double waiPrice){
        this.waiPrice=waiPrice;
    }
    public void setIronPrice(double ironPrice){
       this.ironPrice=ironPrice;
    }
    public void setFoldA(boolean foldA) {
        this.foldA=foldA;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}
