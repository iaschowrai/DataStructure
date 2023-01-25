package Arrays;

import java.util.Arrays;

public class permutation_LC {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int numsize = nums.length;

        for (int i = 0; i < numsize; i++) {
//            important formula for permutation without using space
            nums[i] = nums[i] + (numsize*(nums[nums[i]]%numsize));
        }
        for (int i = 0; i < numsize; i++) {
            nums[i] = nums[i]/numsize;
        }
        System.out.println(Arrays.toString(nums));

    }
}
