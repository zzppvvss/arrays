package task3;

import java.util.Arrays;

public class task3 {
    public static void main (String[] args){
        System.out.println("task3");
        int[] nums1 = {1,2,3};
        int[] nums2 = {5,6,7,1,1,1};
        int lenght = nums1.length + nums2.length;
        int[] numbers = new int[lenght];
        boolean need = false;

        if (Math.abs(nums1.length- nums2.length)!=0) need = true;

        for (int i = 0, k = 0, j = 0; i < lenght || k < nums1.length || j < nums2.length; i++){
                    if(i%2 == 0){
                        if(j >= nums1.length) break;
                        else {
                            numbers[i] = nums1[j];
                            j++;
                        }
                    }else{
                        if(k >= nums2.length) break;
                        else{
                            numbers[i] = nums2[k];
                            k++;
                        }

                    }
        }

        int ji = 0;
        int array_small_l = 0;
        if (nums1.length > nums2.length) {
            ji = nums1.length - Math.abs(nums1.length - nums2.length);
            array_small_l = nums1.length;
        }
        else if (nums2.length > nums1.length)  {
            ji= nums2.length-Math.abs(nums1.length- nums2.length);
            array_small_l = nums2.length;
        }

        if(need == true) {
            for(int i = lenght - Math.abs(nums1.length- nums2.length);i<lenght;i++){
                if(ji >= array_small_l){
                    break;
                }
                else{
                    if (nums1.length > nums2.length)    numbers[i] = nums1[ji];
                    else if (nums2.length > nums1.length)  numbers[i] = nums2[ji];

                    ji++;
                }

            }

        }
        System.out.println(Arrays.toString(numbers));
    }
}
