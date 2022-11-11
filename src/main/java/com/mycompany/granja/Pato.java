/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public class Pato extends Animal {

    public Pato() {
        patas = 2;
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
        return "Cuack!, Cuack!";
    }

    @Override
    String trabajar() {
        return "Nadar, tiene " + patas + " patas ";
    }
}
