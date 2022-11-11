/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.granja;

/**
 *
 * @author mariorosas
 */
public final class Granja {

    protected Animal[] animales = new Animal[15];

    public Granja() {
        llenarVectorDeAnimales();
    }

    public void llenarVectorDeAnimales() {
        for (int i = 0; i < animales.length; i++) {
            Animals access = Animals.animalAleatorio();
            switch (access) {
                case VACA:
                    Vaca vaca = new Vaca();
                    animales[i] = vaca;
                    break;
                case POLLO:
                    Pollo pollo = new Pollo();
                    animales[i] = pollo;
                    break;
                case PATO:
                    Pato pato = new Pato();
                    animales[i] = pato;
                    break;
                case VIBORA:
                    Vibora vibora = new Vibora();
                    animales[i] = vibora;
                    break;
            }
        }

    }

    public void mostrarVectorDeAnimales() {
        for (int i = 0; i < animales.length; i++) {
            i++;
            System.out.println("Animal " + i);
            i--;
            System.out.println("Habla: " + animales[i].hablar() + "\nTrabaja: " + animales[i].trabajar() + "\n");
        }
    }

    public static void main(String[] args) {
        Granja granja = new Granja();
        granja.mostrarVectorDeAnimales();
    }
}
