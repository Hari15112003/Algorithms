package Sorting;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{20, 40, 30, 10, 50, 90, 100, 80, 60, 70};
        int t;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a.length-i-1;j++){

//                reducing the checkings
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    flag=1;
                }

            }
//            reducing the total no of passes
//            if(flag==0){
                System.out.println(i);
//                break;
//            }
        }
        System.out.println(Arrays.toString(a));
    }
}
