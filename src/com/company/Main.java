package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Codigos a = new Codigos();

        int[] arreglo;
        arreglo = new int[12345];

        //Tiempo para el Bubble
        a.bubblesort(arreglo);

        //Tiempo para el merge

       int[] array = new int[10];
        long StartTime = System.nanoTime();
       array = a.recursionMergesort(arreglo);
       long endTime = System.nanoTime() - StartTime;

        System.out.println("el tiempo en ejecutarse es " + endTime);

    }




}
