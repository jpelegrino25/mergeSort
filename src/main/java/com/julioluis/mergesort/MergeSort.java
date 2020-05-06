package com.julioluis.mergesort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {

    List<Integer> array;
    List<Integer> TempArray;

    public void sort(List<Integer> items) {
        prepareForSort(items);
    }

    private void prepareForSort(List<Integer> arr){
        this.array=arr;
        this.TempArray=new LinkedList<>();
        for(Integer i : this.array)
            this.TempArray.add(0);

        doMergeSort(0,arr.size()-1);
    }

    private void doMergeSort(int LowerIndex, int HigherIndex){
        if(LowerIndex< HigherIndex ){
            int middle=LowerIndex+ (HigherIndex-LowerIndex)/2;
            doMergeSort(LowerIndex,middle); //ex.(1-5)
            doMergeSort(middle+1,HigherIndex);//ex.(6,10)
            mergePart(LowerIndex,middle,HigherIndex);
        }
    }

   private void mergePart(int LowerIndex,int middle,int HigherIndex ){
        for(int i=LowerIndex;i<=HigherIndex;i++)
            TempArray.set(i,this.array.get(i));

        List<Integer> listTemp=new ArrayList<>(this.TempArray);
        int i=LowerIndex;
        int j=middle+1;
        int  k=LowerIndex;
        while(i<=middle && j<= HigherIndex){
            if( this.TempArray.get(i)<= this.TempArray.get(j)){
                this.array.set(k,this.TempArray.get(i));
                i++;
            }else{
                this.array.set(k,this.TempArray.get(j));
                j++;
            }
            k++;
        }
        while(i<=middle){
            this.array.set(k,this.TempArray.get(i));
            k++;
            i++;
        }
    }

}
