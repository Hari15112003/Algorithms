package Searching;


import javax.swing.text.Element;

public class JumpSearch {
    //    Better than linear search but not than binary search
    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 3, 5, 6, 44}; /* works in a sorted array */
        int search = 5;
        int n=a.length;
        int k =(int)Math.floor(Math.sqrt(n));
        int prev=0;
        while ( a[Math.min(k,n)-1]<search){
            prev=k;
            k+= (int)Math.floor(Math.sqrt(n));
            if(prev>= n){
                System.out.println("Element not found ");
                break;
            }
        }

        while (a[prev] < search)
        {
            prev++;

            if (prev == Math.min(k, n))
                System.out.println("NOt Found");
        }

        // If element is found
        if (a[prev] == search)
            System.out.println("Element "+ prev);


    }
}