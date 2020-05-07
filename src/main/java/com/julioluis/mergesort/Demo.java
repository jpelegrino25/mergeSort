package com.julioluis.mergesort;

import com.julioluis.mergesort.model.Book;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        MergeSort mergeSort=new MergeSort();
        List<Integer> numberList= Arrays.asList(3,4,56,7,2,100,40,9,80);
        List<String> nameList=Arrays.asList("Juan","Pedro","Santiago","Jose");

        List<Book> bookList=Arrays.asList(new Book(100,"Java Standard","Jorge"),
                new Book(56,"Advanced Javascript","Martha"),
                new Book(2,"Php for Designer","Kleirin"));

        System.out.println("**********INTEGER SORTING***********");
        System.out.println("Before");
        System.out.println(numberList);
        mergeSort.sort(numberList);
        System.out.println("After");
        System.out.println(numberList);

        System.out.println();

        System.out.println("**********STRING SORTING***********");
        System.out.println("Before");
        System.out.println(nameList);
        mergeSort.sort(nameList);
        System.out.println("After");
        System.out.println(nameList);

        System.out.println("**********OBJECT SORTING***********");
        System.out.println("Before");
        System.out.println(bookList);
        mergeSort.sort(bookList);
        System.out.println("After");
        System.out.println(bookList);
    }
}
