package arrys;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {20, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        Arrays.sort(arr);
        int value = 40;//要查找的值
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,value));
    }        System.out.println(val);

    public static int myBinarySearch(int[] arr,int value) {
        int mid=0;
        int lower=0,high=arr.length-1;
        while (lower<=high)  {
            mid=(lower+high)/2;
            if(value==arr[mid]){
                return mid;
            }
            if (value>arr[mid]){
                lower=mid+1;
            }
            if (value<arr[mid]){
                high=mid-1;
            }
        }
        return -1;
    }

}
