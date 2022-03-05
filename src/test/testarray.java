package test;

import java.util.Arrays;

public class testarray {
    public static void main(String[] args) {
        int[][] arrs = {{1,2},{3,4},{5,6}};
        for (int[] arr : arrs) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
