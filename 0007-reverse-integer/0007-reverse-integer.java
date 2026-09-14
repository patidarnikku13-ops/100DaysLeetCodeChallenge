class Solution {
    public int reverse(int x) {
        long revr = 0;
      while( x != 0){
        int ld = x%10;
        revr = revr * 10 + ld;
        x = x/10;
      }  
      
      if(revr >Integer.MAX_VALUE || revr < Integer.MIN_VALUE){
        return 0;
      }
      return (int) revr;
    }
    
}