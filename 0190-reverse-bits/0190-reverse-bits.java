class Solution {
     // Reverse bits of a 32-bit unsigned integer
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0;i<32; i++){
            // Shift result left to make space
            result <<= 1;

            // Extract the last bit of n
            result |= (n & 1);
            
            //  // Shift n right to process next bit
            n >>= 1;
        }
        return result;
    }
}