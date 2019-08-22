package object;

import java.util.Arrays;

//测试java.util.Arrays工具类的使用
public class TestArrays {
    public static void main(String[] args) {
        int[] a = {199,388,9,10,323,34, 20, 30};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,34));
    }
}
