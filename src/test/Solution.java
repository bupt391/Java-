package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (m1,m2)->m1[0]-m2[0]);
        int n = intervals.length-1;
        List<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            int l = intervals[i][0];
            int right = intervals[i][1];
            while(i<n-1 && right <= intervals[i+1][0]){
                right = Math.max(right, intervals[i+1][1]);
                i++;
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(l);
            temp.add(right);
            res.add(temp);
        }
        int[][] rr = new int[res.size()][2];
        for(int i=0; i<res.size();i++){
            rr[i][0] = res.get(i).get(0);
            rr[i][1] = res.get(i).get(1);
        }

        return rr;

    }

    public static void main(String[] args) {
        int[][] rr= {{1,3},{8,10},{15,18},{2,6}};
        int[][] ss = merge(rr);
        System.out.println(Arrays.deepToString(ss));
    }

}