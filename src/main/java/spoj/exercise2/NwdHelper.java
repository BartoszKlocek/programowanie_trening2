package spoj.exercise2;

import java.util.ArrayList;
import java.util.List;

public class NwdHelper {

    public List<Integer> primeFactors(int n) {
        List<Integer> primeNumbersList = new ArrayList<>();
        //primeNumbersList.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeNumbersList.add(i);
                n = n / i;
                i--;
            }

        }

        return primeNumbersList;
    }


    public int getNwd(int a, int b) {
        if (a%b==0){
            return b;
        }
        else if (b%a==0){
            return a;
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = primeFactors(a);
        List<Integer> list2 = primeFactors(b);

        for (int i =0; i<= list1.size()-1;i++){
            for (int j =0; j<= list2.size()-1; j++){
                if (list1.get(i)==list2.get(j)){
                    list.add(list2.get(j));
                }
            }
        }
        //if (list.size()==0){
            //return 1;
        //}
        if (list.size()>=1) {
            return list.get(list.size() - 1);
        }
        else
            return 1;
    }

    public List<Integer> getCommonList(int a, int b){

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = primeFactors(a);
        List<Integer> list2 = primeFactors(b);

        for (int i =0; i<= list1.size()-1;i++){
            for (int j =0; j<= list2.size()-1; j++){
                if (list1.get(i)==list2.get(j)){
                    list.add(list2.get(j));
                }
            }
        }
        //if (list.size()==0){
        //return 1;
        //}
        return list;
    }
}
