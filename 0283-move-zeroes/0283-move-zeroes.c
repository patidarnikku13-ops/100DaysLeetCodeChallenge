void moveZeroes(int* nums, int numsSize) {
    int result=0;
    for(int i = 0 ; i<numsSize;i++){
    if(nums[i] != 0)
    {nums[result++]=nums[i];}


    }while(result<numsSize)
{nums[result++]=0;}
}

