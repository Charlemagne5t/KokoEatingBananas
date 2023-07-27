import java.util.Arrays;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        int mid = left + (right - left)/ 2;


        int result = Integer.MAX_VALUE;

        while (left <= right){
            mid = left+ (right - left)/ 2;

            if(madeIt(piles, h, mid)){
                result = Math.min(mid, result);
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        return result;
    }

    private boolean madeIt(int[] piles, int h, int k){
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            int carry = piles[i] % k;
            time += piles[i] / k;
            if(carry != 0){
                time++;
            }
            if(time > h){
                return false;
            }
        }
        return time <= h;
    }
}
