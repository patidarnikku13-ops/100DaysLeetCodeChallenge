import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // count frequency
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num , 0)+1);
        }
       
//sort key 
List<Integer> sortedKeys = new ArrayList<>(freqMap.keySet()) ;
sortedKeys.sort((a,b)->freqMap.get(b)-freqMap.get(a));

//take top k
int[] result = new int[k];
for(int i = 0; i<k;i++){
    result[i] = sortedKeys.get(i);
}
 return result;  
     
    }
}