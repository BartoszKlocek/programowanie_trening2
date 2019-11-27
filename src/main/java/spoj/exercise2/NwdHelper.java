package spoj.exercise2;

import java.util.ArrayList;
import java.util.List;

public class NwdHelper {

    public List<Integer> primeFactors(int n) {
        List<Integer> primeNumbersList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeNumbersList.add(i);
                n = n / i;
                i--;
            }

        }

return primeNumbersList;
    }
}
