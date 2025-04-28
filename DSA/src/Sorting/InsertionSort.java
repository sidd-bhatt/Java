package Sorting;

import java.util.*;
public class InsertionSort {
    void sort(int[] array){
        int len = array.length;
        for(int i = 1; i<len; i++){
            int key = array[i];
            int j = i - 1;
            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort ms = new InsertionSort();
        ms.sort(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num +" "));
    }
}