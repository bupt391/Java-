package test;

import java.util.Arrays;

public class quick {

    public static void quick_sort(int[] arrs, int left, int right){
        int[] arr = Arrays.copyOfRange(arrs,left,right);
        if(left >=  right){
            return ;
        }
        int len = arr.length;
        int temp = one_sort(arr, left,right);
        quick_sort(arr, 0,temp-1);
        quick_sort(arr, temp+1, len-1);

    }

    private static int one_sort(int[] arr, int i, int j) {
        int jizhun = i;
        int index = i+1;
        for(int p = index; p <= j; p++){
            if(arr[p] < arr[jizhun]){
                change(arr,index, p);
                index++;
            }
            change(arr,index-1,p);
        }
        return index-1;
    }

    private static void change(int[] arr, int index, int p) {
        int tt = arr[index];
        arr[index] = arr[p];
        arr[p] = tt;
    }


    public static void main(String[] args) {
        int[] text = new int[]{2,4,1,9,5,3,10,8};
        quick_sort(text,0,7);
        System.out.println(text.toString());

    }
}
