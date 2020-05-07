package com.julioluis.mergesort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {

    List<T> array;
    List<T> TempArray;

    public void sort(List<T> items) {
        prepareForSort(items);
    }

    private void prepareForSort(List<T> arr){
        this.array=arr;
        this.TempArray=new LinkedList<>();
        for(T i : this.array)
            this.TempArray.add(null);

        doMergeSort(0,arr.size()-1);
    }

    private void doMergeSort(int LowerIndex, int HigherIndex){
        if(LowerIndex< HigherIndex ){
            int middle=LowerIndex+ (HigherIndex-LowerIndex)/2;
            doMergeSort(LowerIndex,middle);
            doMergeSort(middle+1,HigherIndex);
            mergePart(LowerIndex,middle,HigherIndex);
        }
    }

   private void mergePart(int LowerIndex,int middle,int HigherIndex ){
        for(int i=LowerIndex;i<=HigherIndex;i++)
            TempArray.set(i,this.array.get(i));

        List<T> listTemp=new ArrayList<>(this.TempArray);
        int i=LowerIndex;
        int j=middle+1;
        int  k=LowerIndex;
        while(i<=middle && j<= HigherIndex){
            if( listTemp.get(i).compareTo(listTemp.get(j)) <0){
                this.array.set(k,listTemp.get(i));
                i++;
            }else{
                this.array.set(k,listTemp.get(j));
                j++;
            }
            k++;
        }
        while(i<=middle){
            this.array.set(k,listTemp.get(i));
            k++;
            i++;
        }
    }

}
