package info.belikov.codewars.k2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Long> result = Arrays.stream(a).boxed().collect(Collectors.groupingBy(t -> t, Collectors.counting()));
        return result.entrySet().stream().filter(r -> r.getValue() % 2 != 0).findFirst().map(Map.Entry::getKey).get();
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[] {-1,2,3,4,5,1,1,2,3,3,4}));
    }
}
