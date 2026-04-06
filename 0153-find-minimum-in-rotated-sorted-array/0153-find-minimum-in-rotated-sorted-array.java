class Solution {
    public int findMin(int[] nums) {
      int left = 0,right = nums.length -1;

      while(left<right){
        int mid = left + (right - left)/2;

        //if mid>rightmost the minimum must be right half
        if(nums[mid]>nums[right]){
            left = mid +1;
        }
        else{
            right = mid;
        }
      } 
      return nums[left]; 
    }
}