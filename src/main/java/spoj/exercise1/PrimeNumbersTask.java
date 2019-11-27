package spoj.exercise1;

import java.util.List;

public class PrimeNumbersTask {
PrimeNumbersHelper primeNumbersHelper = new PrimeNumbersHelper();
    public String isPrimeOrNot(int n){
        List<Integer> tmp = primeNumbersHelper.primeNumbers();
        if (tmp.contains(n)){
            return "TAK";
        }
        else {
            return "NIE";
        }
    }
}
