/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public class Vaca extends Animal {

    public Vaca() {
        patas = 4;
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
    String hablar() {
        return "Muuu!, Muu!";
    }

    @Override
    String trabajar() {
        return "Produce leche, tiene " + patas + " patas";
    }
}
