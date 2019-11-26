package spoj.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class PrimeNumbersHelper {


    public List<Integer> primeNumbers() {
        List<Integer> allnumbersList = new ArrayList<Integer>();
        for (int i = 2; i <= 10000; i++) {
            allnumbersList.add(i);
        }

        List<Integer> primeNumbersList = allnumbersList
                .stream()
                .map(a -> {
                    List<Integer> tmp = new ArrayList<Integer>();
                    for (int i = 1; i <= 10000; i++) {
                        if (a % i == 0) {
                            tmp.add(a);
                        }

                    }
                    if (tmp.size() == 2) {
                        return a;
                    }
                    return null;

                })
                .filter(a -> a != null)
                .collect(Collectors.toList());

        return primeNumbersList;
    }

}
