package test;

import java.util.*;
public class test_inandout{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int num=0,m=0;
            long val=0;
            if(sc.hasNextLine()){
                num = sc.nextInt();
                m  = sc.nextInt();
                val = sc.nextInt();
            }
            int[] aa = new int[num];
            for(int l = 0; l<num; l++){
                aa[l] = sc.nextInt();
            }
//            System.out.println(Arrays.toString(aa));
            boolean flag = get(val, m, aa,0);
            System.out.println(flag);
        }

    }

    public static boolean get(long res, int m, int[] position, int i){
        if(res<0 || m<0 || i >= position.length){
            return false;
        }
        if(i == position.length-1 && res-position[i] == 0){
            return true;
        }
        long kk = (long) Math.pow(position[i],3);
        int o = position[i];
        return get(res-o,m,position,i+1) ||  get(res-kk, m-1,position,i+1);
    }



}