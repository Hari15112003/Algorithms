package Searching;

public class InterpolationSearch {
//    Better than binary search
//    instead of going for middle element and seraching we use a linear interpolation formula

     public static   int linearInterpolation(int[] a,int lo, int ub,int searchElement ){
         int pos;
        if(lo<ub && a[lo]<=searchElement && a[ub]>=searchElement){
            pos = lo
                    + (((ub - lo) / (a[ub] - a[lo]))
                    * (searchElement - a[lo]));

            if(a[pos]==searchElement){
                return  pos;
            } else if (a[pos]<searchElement) {
              return   linearInterpolation(a,pos+1,ub,searchElement);
            }else {
             return   linearInterpolation(a,lo,pos-1,searchElement);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int[] a = new int[]{10,20,30,40,50,60,70,80,90,100};
         int res =InterpolationSearch.linearInterpolation(a,0,a.length-1, 50);
        System.out.println(res);
    }
}
