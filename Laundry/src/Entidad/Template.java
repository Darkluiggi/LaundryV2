/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author luaalvarezve
 */
public class Template {
    
    private String gender;
    private String clothName;
    private float washPrice;
    private float waiPrice;
    private float ironPrice;
    private boolean fold;
    
    
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
