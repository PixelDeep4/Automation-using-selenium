package day6Arrays;

public class printOddAndEvenElementFromArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,65};
        int counteven=0, countodd = 0;
        for (int i=0; i<a.length; i++){
            if (a[i]%2==0){
                System.out.println(a[i]+" is an even number");
                counteven++;
            }else {
                System.out.println(a[i]+" is a odd number");
                countodd++;
            }
        }System.out.println("There are "+counteven+" even numbers and "+countodd+" odd numbers in a given array");
    }
}
