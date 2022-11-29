/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lingkaran;
import com.bangundatar.Bangundatar;
/**
 *
 * @author HeruSubakti
 */
public class Lingkaran implements Bangundatar {
     private  int jari;
      public Lingkaran (int jari){
          this.jari = jari;
      }

    @Override
    public double luas() {
       return (Math.PI * jari * jari)/2; //To change body of generated methods, choose Tools | Templates.
    }
}
