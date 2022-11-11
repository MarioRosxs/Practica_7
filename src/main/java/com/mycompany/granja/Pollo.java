/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public class Pollo extends Animal {

    public Pollo() {
        this.patas = 2;
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
        return "Pio!, Pio!";
    }

    @Override
    String trabajar() {
        return "Produce huevo, tiene " + patas + " patas";
    }

}
