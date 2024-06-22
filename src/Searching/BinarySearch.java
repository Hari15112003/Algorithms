package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a =new int []{1,2,3,5,6,44};
        int search=5;
        int l=0;
        int r=a.length-1;
        int m;
        while (l<=r){
            m=l+(r-l)/2;
            if (a[m]==search){
                System.out.println("Element found at index "+m);
                break;
            } else if (a[m]<search) {
                l=m+1;
            }else{
                r=m-1;
            }
        }
        if(l>r){
            System.out.println("Element not found");
        }
    }
}
