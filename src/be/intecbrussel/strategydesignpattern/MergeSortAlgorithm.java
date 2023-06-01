package be.intecbrussel.strategydesignpattern;

import java.util.Arrays;

public class MergeSortAlgorithm implements ArraySortingAlgorithm{
    @Override
    public int[] sortArray(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }
}
