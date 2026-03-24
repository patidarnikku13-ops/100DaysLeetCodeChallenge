import java.util.*;
class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length - 1;
       int maxArea = 0;

       while(left<right){
        // cal the area betwween pointer
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        int area = width * minHeight;

        // update max area
        maxArea = Math.max(maxArea, area);

        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
       } 
       return maxArea;
    }
}