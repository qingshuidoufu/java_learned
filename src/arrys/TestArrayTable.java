package arrys;

import java.util.Arrays;

public class TestArrayTable {
    public static void main(String[] args) {
        Object[] emp1={1001,"jack",18,"外教","2000.9.1"};
        Object[] emp2={1001,"jack2",19,"程序员","2010.9.1"};
        Object[] emp3={1001,"jack3",20,"销售","2020.9.1"};

        Object[][]tableDate=new Object[3][];
        tableDate[0]=emp1;
        tableDate[1]=emp2;
        tableDate[2]=emp3;
        for (Object[]temp:tableDate
             ) {
            System.out.println(Arrays.toString(temp));

        }
    }
}
