package day6Arrays;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args) {
        int a[] = {10,20,10,10,10,20,30,20};
        int search_element = 10;
        int repitition = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]==search_element){
                repitition++;
            }
        }
        System.out.println("There are "+(repitition)+" elements of "+search_element);
    }
}
