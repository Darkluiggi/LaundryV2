/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author luaalvarezve
 */
@Entity
@Table (name="Pantilla")
public class Template implements Serializable  {
    
    private String gender;
    private String clothName;
    private float washPrice;
    private float waiPrice;
    private float ironPrice;
    private boolean fold;
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     
      public int getId(){
        return id;        
    }
    
    public void setId(int id){
        this.id = id;
    }
    public Template(){
    }

    public String getGender() {
        return gender;
    }

     public String getClothName() {
        return clothName;
    }
    
    public float getWashPrice(){
        return washPrice;
    }
    public Boolean getFold(Boolean fold) {
        return fold;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }
//    public void setRol(Boolean rol) {
//        this.rol = rol;
//    }
}
