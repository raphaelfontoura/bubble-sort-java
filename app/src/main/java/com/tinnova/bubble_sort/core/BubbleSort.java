package com.tinnova.bubble_sort.core;

import java.util.Arrays;
import java.util.List;

public class BubbleSort{

    public static Integer[] order(Integer[] vector) {
        var limitFor = vector.length - 1;
        boolean swap;
        do {
            swap = false;
            for (int count = 0; count < limitFor; count++) {
                if (vector[count] > vector[count+1]) {
                    var minorValue = vector[count+1];
                    vector[count+1] = vector[count];
                    vector[count] = minorValue;
                    swap = true;
                }
            }
            limitFor--;
        } while (swap);
        return vector;
    }

    public static List<Integer> order(List<Integer> list) {
        Integer[] vector = list.toArray(new Integer[0]);
        var orderedVector = order(vector);
        return Arrays.asList(orderedVector);
    }

}
