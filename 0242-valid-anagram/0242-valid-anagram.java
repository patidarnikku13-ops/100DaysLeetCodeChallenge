class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] a = s.toCharArray();
        char b[] = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);//Arrays.equals() dono arrays ke elements ko ek-ek karke compare karta hai
    
    }
}