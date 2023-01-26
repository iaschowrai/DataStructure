package Arrays;

public class EvenNumberOfDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(evenNumber(nums));
    }
//
//    static int evenNumber(int[] nums){
//        int count = 0;
//        for (int num : nums) {
//            if (even(num)) {
//                count++;
//            }
//        }
//        return count;
//    }
//    static boolean even(int num){
//        int numberofdigits = digit(num);
//            return numberofdigits % 2 ==0;
//    }
//    static int digit(int num){
//        int count = 0;
//        while(num >0){
//            count++;
//            num/= 10;
//        }
//        return count;
//    }
    static int evenNumber(int[] nums){

        int count =0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while( nums[i] > 0){
                digit++;
                nums[i]/=10;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;

    }

}

