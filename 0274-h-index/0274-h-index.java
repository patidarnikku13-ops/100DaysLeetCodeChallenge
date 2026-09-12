class Solution {
    public int hIndex(int[] citations) {
    //     int h = 0;
    //     int n = citations.length - 1;
    //     for(int i = 0; i<n; i++){
    //      int count = 0;
    //         for( int j = 0; j<citations.length;j++){
    //         if(citations[j] >= i+1){
    //             count++;
    //         }
    //       }
    //       if(count >= i+1){
    //         h=i+1;
    //       }
    //     }
    //     return h;


    Arrays.sort(citations);

    int n = citations.length;

    for(int i = 0; i< n ;i++){
        int papers = n-i;

        if(citations[i] >= papers){
            return papers;
        }
      }
      return 0;
     }
}