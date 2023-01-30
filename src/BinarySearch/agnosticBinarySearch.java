package BinarySearch;

public class agnosticBinarySearch {

    public static void main(String[] args) {
//        int[] arr = {5,8,9,11,23,25,65,85,99};
        int[] arr = {99,88,77,66,55,25,23,21,19,18,10,8,3};
        int target = 66;
        String ans = bSearch(arr,target);
        System.out.println(ans);
    }
    static String bSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start +(end - start)/2;

            if(target == arr[mid]){
                return "Index Number: " + mid;
            }
            if(isAsc ==true) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return String.valueOf(-1);
    }
}
