package day6Arrays;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,10,20,5};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(a));
    }
}
