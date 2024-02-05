package Sortings;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Comparable[] a = {"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};

        MergeSort.sort(a);

        System.out.println(java.util.Arrays.toString(a));

    }
}
