package task1;

public class task1 {
    public static void main(String[] args) {
        System.out.println("task1");
        int[] values = {1,0,2,5,6,4,10,3};
        int max = values[0], min = values[0], i_max = 0, i_min = 0, sum = 0;
        for (int i = 1; i< values.length; i++){
            if (values[i] > max){
                max = values[i];
                i_max = i;
            }
            if(values[i] < min){
                min = values[i];
                i_min = i;
            }

        }
        System.out.println("max index: " + i_max);
        System.out.println("min index: " + i_min);
        for(int i=i_min;i<i_max;i++){
        sum += values[i];
        }
        System.out.println(sum);
    }
}