package BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {5,8,9,11,23,25,65,85,99};
        int target = 65;
        String ans = bSearch(arr,target);
        System.out.println(ans);
    }
    static String bSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end - start)/2;

            if(target == arr[mid]){
                return "Index Number: " + mid;
            } else if( target < arr[mid]){
                end = mid - 1;
            } else{
                start =mid + 1;
            }

        }
        return String.valueOf(-1);
    }
}
