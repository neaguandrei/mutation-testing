package test;

import java.util.List;
import java.util.Objects;

public class Utility {

    private Utility() {}

    public static long getTotalPerfectNumbers(int min, int max, int size, List<Integer> list) {
        if (Objects.isNull(list) || list.size() != size) {
            return -1;
        }

        if (min < 0 || max < 0 || min >= max || size < 1 || size > 100) {
            return -1;
        }

        return list.stream()
                .filter(current -> current >= min && current <= max)
                .filter(current -> {
                    int divSum = 1;
                    for (int div = 2; div <= current / 2; div++) {
                        if (current % div == 0) {
                            divSum += div;
                        }
                    }
                    return current == divSum;
                })
                .count();
    }
}
