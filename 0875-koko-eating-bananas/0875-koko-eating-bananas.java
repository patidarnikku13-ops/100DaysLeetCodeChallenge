class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = getMax(piles);  //serach space [1, max piles]

        while(left < right ){
            int mid = left + (right - left) / 2; //candidate speed
            if(canEatAll(piles , h , mid)){
                right = mid; // try smaller speed
            }
            else{
                left = mid + 1;// need faster speed
            }
        }
        return left;  // smallest valid speed
    }

     private int getMax(int[] piles){
        int max = 0;
        for(int pile : piles){
            max = Math.max(max, pile);
        }
        return max; // find largest upper bound of the set
     }

     private boolean canEatAll(int[] piles, int h, int k){
        int hours = 0;

        for(int pile : piles){
            hours +=(pile + k - 1) / k;
        }
        return hours <= h;
     }
}