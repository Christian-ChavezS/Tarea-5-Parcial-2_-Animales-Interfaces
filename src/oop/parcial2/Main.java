package oop.parcial2;

import java.util.LinkedList;
import java.util.List;
import oop.parcial2.*;


public class Main {
    public static void main(String []args) {

        List<Animal> animales = new LinkedList<Animal>();


        animales.add(new Aguila());
        animales.add(new Halcon());
        animales.add(new Condor());
        animales.add(new Gorrion());

        animales.add(new Sardina());
        animales.add(new Trucha());
        animales.add(new Tilapia());
        animales.add(new Salmon());

        animales.add(new Tortuga());
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Raton());

        for (Animal animal : animales) {
            System.out.println(animal.toString());
        }

    }


        public static void Nadador (List < AnimalQueNada > A_Nadadores) {
            System.out.println("Animales Nadadores\n");
            for (AnimalQueNada acuatico : A_Nadadores) {
                acuatico.nadar();
            }
            System.out.println("---------------------------------------------------\n");
        }

        public static void Volador (List < AnimalQueVuela > A_Voladores) {
            System.out.println("Animales Voladores\n");
            for (AnimalQueVuela aereo : A_Voladores) {
                aereo.Volar();
            }
            System.out.println("---------------------------------------------------\n");
        }

        public static void Caminante (List < AnimalQueCamina > A_Caminante) {
            System.out.println("Animales Terrestres\n");
            for (AnimalQueCamina terrestre : A_Caminante) {
                terrestre.caminar();
            }
            System.out.println("---------------------------------------------------\n");
        }

}
