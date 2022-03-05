package test;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
public class min_dic {
    public static void main(String[] args) {
        List<Integer> mm= lexicalOrder(13);
        System.out.println(mm.toArray().toString());
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        if(n<=9){
            for(int i=1;i<=9;i++){
                ll.add(i);
            }
            return ll;
        }else{
            for(int i=9;i>=1;i--){
                st.push(i);
            }
            while(!st.isEmpty()){
                int temp = st.peek();
                ll.add(st.pop());
                if(temp * 10 >n)
                    continue;
                else{
                    int m = n - temp*10;
                    while(m>=0){
                        st.push(temp*10+m);
                        m--;
                    }
                }


            }




        }
        return ll;

    }



}
