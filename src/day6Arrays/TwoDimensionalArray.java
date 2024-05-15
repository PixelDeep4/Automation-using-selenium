package day6Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // declaring array

        //Approach1
        /*
        int a[][]=new int[3][2];
        // int [][]a=new int[3][2];
        // int []a[]=new int[3][2];

        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;
        */
        // Approach 2
        int a[][]={{100,200},{300,400},{500,600}};

        //Find size of an array
        System.out.println("length of rows:"+a.length);
        System.out.println("length of columns:"+a[0].length);

        // read single value from an array
        // System.out.println(a[2][1]); //600
        /*
        for (int i = 0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }*/

        // enhanced for loop
        for (int arr[]:a){
            for (int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
