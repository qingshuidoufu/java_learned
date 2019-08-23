package arrys;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values={3,1,6,2,9,0,7,4,5,8};
        int temp=0;
        for (int i = 0; i <values.length ; i++) {
            boolean flag=true;  //做个标记
            for (int j = 0; j < values.length - 1-i; j++) {
                //比较大小,换顺序
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;

                    flag=false;//如果发生交换则没排好
                }

                System.out.println(Arrays.toString(values));
            }
            if (flag){
                System.out.println("结束!!!!");
                 break;   //已经有顺序了没有发生交换就没必要排了
            }
            System.out.println("##########");
        }

    }
}
