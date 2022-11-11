/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.granja;

import java.util.Random;

/**
 *
 * @author mariorosas
 */
public enum Animals {
    VACA, PATO, POLLO, VIBORA;

    private static final Random PRNG = new Random();

    public static Animals animalAleatorio() {
        Animals[] animal = values();
        return animal[PRNG.nextInt(animal.length)];
    }
}
