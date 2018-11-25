package com.basedemo;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={12, 10, 11, 7, 6, 5, 4, 3, 2, 1};

        SelectionSort s = new SelectionSort();
        s.selectionSortTest(a);
        for (int i: a) {
            System.out.print(i+" ");
        }
    }
    public void selectionSortTest(int a[]){
        if (a==null||a.length<=0){
            return;
        }
        for(int i = 0; i < a.length -1; i++) {//比n-1趟
            int k = i;
            for (int j = k + 1; j < a.length; j++) {
                //每次选择排序都从确定的最小的元素的后一个元素开始，与选定元素选择排序
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if(i!=k){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }
}
