package Sorting;

public class QuickSort {
    int partition(int[] a,int l , int r){
        int p =a[l];
        int s=l;
        int e=r;

        while (s<e){
            while(a[s]<=p){
                s+=1;
            }
            while(a[e]>p){
                e-=1;
            }
            if(s<e){
                int t=a[s];
                a[s]=a[e];
                a[e]=t;
            }
        }
        int t=a[l];
        a[l]=a[e];
        a[e]=t;
        return  e;
    }
    /* function to implement quick sort */
    void quick(int[] a, int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */
    {
        if (start < end)
        {
            int p = partition(a, start, end);  //p is partitioning index
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    /* function to print an array */
    void printArr(int[] a, int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }

    public static void main(String[] args) {
        int[] a = { 13, 18, 27, 2, 19, 25 };
        int n = a.length;
        QuickSort q1 = new QuickSort();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(a, n);
        System.out.println();
    }
}
