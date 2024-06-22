package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = new int []{ 1,2,34,5,6};
        int searchElement = 22;
        int s=0;
        for(int i=0;i<a.length;i++){
            if (a[i]==searchElement){
                System.out.println("Element found at index "+i);
                s=1;
                break;
            }
        }
        if (s==0){
            System.out.println("Element not found in the array");
        }
    }
}
