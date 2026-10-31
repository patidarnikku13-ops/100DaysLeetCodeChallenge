bool isPalindrome(int x) {
   int original =x;
    if(x<0) return 0;
    else{
    long  rev=0;
    while(x!=0){
    rev=rev*10+(x%10);
     x=x/10;
    }
    if(original==rev){
     return 1;
    }
    else
    return 0;
    }
}