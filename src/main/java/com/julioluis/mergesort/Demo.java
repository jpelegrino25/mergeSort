package com.julioluis.mergesort;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        List<Integer> numberList= Arrays.asList(3,4,56,7,2,100,40,9,80);

        System.out.println("Before");
        System.out.println(numberList);
        mergeSort.sort(numberList);
        System.out.println("After");
        System.out.println(numberList);
    }
}
