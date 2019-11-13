package com.company;

import java.util.PriorityQueue;

public class Codigos {
    public void heapsort(){
 int[] a = new int[10];
 long start = System.currentTimeMillis();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int Array1 : a){
            queue.add(Array1);
        }
        for (int i = 0; !queue.isEmpty(); i++){
            a[i] = queue.remove();
        }
        long end = System.currentTimeMillis();
        System.out.println(" El Heapsort tarda en ejecutarse: " + (end - start) + " milisegundos ");

    }

    public int[] mergesort(int[] uno, int[] dos ){


        int[] tres = new int[uno.length + dos.length];
        int i, j = 0, k = 0;

        for (i = 0; i < tres.length && j < uno.length && k < dos.length; i++){

            if (uno[j] < dos[k]) {
                tres[i] = uno[j++];
            }

            else {
                tres[i] = dos[k++];
            }
        }

        for (; i < tres.length; i++){
            if(j < uno.length){
                tres[i] = uno[j++];
            }
            if(k < dos.length){
                tres[i] = dos[k++];
            }

        }
        return tres;
    }

    public int [] recursionMergesort(int[] array2){

        if (array2.length == 1)
            return array2;

        int[] inf = new int[array2.length/2];

        int[] sup = new int[array2.length - inf.length];

        for (int i = 0; i < inf.length; i++) {

            inf[i] = array2[i];

        }

        for (int j = 0; j < sup.length; j++) {
            int  i = 0;
            sup[j] = array2[i +j];

        }


    return mergesort(recursionMergesort(inf), recursionMergesort(sup));
    }


}
