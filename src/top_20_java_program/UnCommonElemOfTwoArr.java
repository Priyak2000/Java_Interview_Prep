package top_20_java_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnCommonElemOfTwoArr {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 6, 4, 9, 5};
        Integer arr2[] = {1, 3, 4, 8,  8, 5, 7};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        List<Integer> unCommonElements = new ArrayList<>();
        for (Integer i : list1) {
            if (!list2.contains(i)) {
                unCommonElements.add(i);
            }
        }
        for (Integer i : unCommonElements) {
            System.out.print(i + " ");
        }
    }
}
