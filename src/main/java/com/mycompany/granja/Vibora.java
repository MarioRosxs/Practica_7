/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public class Vibora extends Animal {
    
    
    public Vibora()
    {
        patas = 0;
    }

    @Override
    public int getPatas() {
        return patas;
    }

    @Override
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    @Override
    String hablar()
    {
        return "Sss!, Sss!";
    }
    @Override
    String trabajar()
    {
        return "Come roedores, tiene " + patas + " patas";
    }
}
