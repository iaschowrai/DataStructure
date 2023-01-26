package Arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        sum(nums);
    }
    static void sum(int[] nums){
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
