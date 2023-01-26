package Arrays;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] account = {{1,5},{7,3} ,{3,5}};
        act(account);
    }

     static void act(int[][] accounts) {

        int[] ans = new int[accounts.length];
         for (int i = 0; i < accounts.length; i++) {
             for (int j = 0; j < accounts[i].length; j++) {
                 ans[i] =ans[i] + accounts[i][j];
             }
         }
         int k = maxWealth(ans);
         System.out.println(k);
    }
    private static int maxWealth(int[] ans) {
        int max = ans[0];
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] > max){
                max = ans[i];
            }
        }
        return max;

    }


}
