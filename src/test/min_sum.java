package test;

import java.util.ArrayList;

public class min_sum {
    public static void main(String[] args) {
        int[] s = {1,2,4,7,11,15};
        ArrayList<Integer> res =min_s(s,15);
        System.out.println(res.toString());
    }

    public static ArrayList<Integer> min_s (int[] array,int sum){
        ArrayList<Integer> arr = new<Integer> ArrayList();
        int len  = array.length;
        if(sum >= array[len-1] || len==0 ||sum<=array[0]){
            return arr;
        }
        int j = len-1;
        for(int i=0;i<len;i++){

            while(j!=i &&  array[j] + array[i] > sum)
            {
                j--;
            }
            if(array[j] + array[i] == sum)
            {
                arr.add(array[i]);
                arr.add(array[j]);
                return arr;
            }
            j = j+1;
            continue;
        }

        return arr;
    }
}
