package task2;

import java.util.Arrays;

public class task2 {

    public static void main (String[] args){
        System.out.println("task2");
        int[] values = {1, 3, 4, 6, 89, 19, 0, 2};
        int temp_next = values[1], temp_current = values[0];
        values[0] = values[(values.length-1)];
        for (int i = 0; i < values.length - 1;i++){
                temp_next = values[i+1];
                values[i+1] = temp_current;
                temp_current = temp_next;
        }
        System.out.println(Arrays.toString(values));
    }
}
