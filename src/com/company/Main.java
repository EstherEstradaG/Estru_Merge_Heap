package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Codigos a = new Codigos();

        int[] arreglo;
        arreglo = new int[111219];

        //Tiempo para el Heapsort
        a.heapsort();

        //Tiempo para el merge

       int[] array = new int[10];
        long StartTime = System.currentTimeMillis();
       array = a.recursionMergesort(arreglo);
       long endTime = System.currentTimeMillis() - StartTime;

        System.out.println(" El mergesort tarda en ejecutarse: " + endTime + " Milisegundos ");

    }




}
