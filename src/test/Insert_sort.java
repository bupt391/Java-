package test;

import java.util.Arrays;

public class Insert_sort {
    public static void main(String[] args) {
//        int[] s= {1,9,0,5,-4,2};
        int[] s = {6,7,8,9,5,1,8,9,10};
        quick_insert(s,0,s.length-1);
        System.out.println(Arrays.toString(s));

    }
//插入排序算法
    public static void insert_sort(int[] array){
        int len = array.length;
        for(int i=1;i<len;i++){
            int value = array[i];
            int index=i-1;
            while(index >= 0 && value<array[index]){
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = value;

        }
    }


//快速排序算法

    public static void quick_insert(int[] array,int left,int right){
        int l = left;int r = right;
        int mid = (l+r)/2;
        int temp = 0;
        while(l<r){
            while(array[l] <= array[mid]){
                l++;
            }
            while(array[r] > array[mid]){
                r--;
            }
            if(l>=r){
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            if(array[l] == array[mid]){
               r--;
            }
            if(array[r] == array[mid]){}
                l++;
        }

        if(l == r){
            l++;
            r--;
        }
        if(left < r){
            quick_insert(array,left,r);
        }
        if(right > l){
            quick_insert(array,l,right);
        }

    }



}

