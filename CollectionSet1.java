package com.company;

import java.util.HashSet;

public class CollectionSet1 {

    public static void main(String args[]) {


//Declaracion


        HashSet<String> frutas = new HashSet<String>();



        // Añadir elementos


        frutas.add("Manzana"); frutas.add("Mango"); frutas.add("Uvas"); frutas.add("Naranja");

        frutas.add("Fresas");



//Añadir elementos duplicados


        frutas.add("Apple");

        frutas.add("Mango");




//Ver coleccion


        System.out.println(frutas); } }