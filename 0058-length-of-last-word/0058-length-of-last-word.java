class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;
    for(int i = s.length() - 1; i>=0 ;i--){
        if(s.charAt(i) != ' '){
            count++;
        }
        else if(count > 0){
              break;
        }
      }
    return count;
    

    // or
    // int count = 0;
    // int n = s.length() - 1;

    //  while (n >= 0 && s.charAt(n) == ' ') {
    //     n--;
    // }

    // while(n >= 0 && s.charAt(n) != ' '){
    //     count++;
    //     n--;
    // }
    // return count;


    }
}