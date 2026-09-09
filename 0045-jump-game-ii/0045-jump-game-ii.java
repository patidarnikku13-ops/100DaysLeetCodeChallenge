class Solution {
    public int jump(int[] nums) {
        int farthest = 0;
        int currEle = 0;
        int jump =0;
        for(int i = 0; i< nums.length - 1 ; i++){

           farthest = Math.max(farthest , i + nums[i]);
        

            if(i == currEle){
                jump++;
                currEle = farthest;
            }
        }
          return jump;
    }
}