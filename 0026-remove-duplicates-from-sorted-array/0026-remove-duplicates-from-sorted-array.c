int removeDuplicates(int* nums, int numsSize) {
   int count = 1;
   int k = nums[0];
   for(int i = 1 ; i<=numsSize-1;i++) {
    if(k!=nums[i]){
      k=nums[i];
      nums[count]=nums[i];//for unique value 
       count++;
     }
   }
   return count;  
}