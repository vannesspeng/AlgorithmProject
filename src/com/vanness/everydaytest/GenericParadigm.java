package com.vanness.everydaytest;

public class GenericParadigm {
    public static void main(String[] args) {
        int minInteger = min(new Integer[]{1, 2, 4});
        double minDouble = min(new Double[]{1.2, 2.2, -1d});//result:-1d
    }

    private static <T extends Number & Comparable<? super T>> T min(T[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) {
                min = values[i];
            }
        }
        return min;
    }

}
