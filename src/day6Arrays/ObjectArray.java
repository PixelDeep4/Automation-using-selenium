package day6Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        Object a[] = {100, 10.5, 'A',"WELCOME",true};

        /*
        for (Object x:a){
            System.out.print(x+" ");
        }*/

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
