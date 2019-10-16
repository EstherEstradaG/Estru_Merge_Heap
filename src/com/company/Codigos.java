package com.company;

public class Codigos {
    public void bubblesort(int[] array){

        Long start = System.nanoTime();
        for (int i = 0; i < array.length; i++){
            long time = System.nanoTime() - start;
            for (int j =0; j< array.length; j++){
                if (array[j] < array[i]) {
                    int a = array[j];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        Long time = System.nanoTime() - start;
        System.out.println("El tiempo en ejecutarse en bubble sort es: " + time + " mili segundos");

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
