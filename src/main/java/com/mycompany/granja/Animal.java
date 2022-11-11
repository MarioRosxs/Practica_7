/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public abstract class Animal {

    protected int patas;

    public Animal(int patas) {
        this.patas = patas;
    }

    public Animal() {
        this.patas = 0;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    abstract String hablar();

    abstract String trabajar();

}
