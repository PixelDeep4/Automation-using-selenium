package day6Arrays;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
        // char s[]={'D','C','A','B'};
        String s[] = {"scott","marry","john","David"};
        System.out.println("Array before sorting: "+ Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Array after sorting: "+ Arrays.toString(s));
    }
}
