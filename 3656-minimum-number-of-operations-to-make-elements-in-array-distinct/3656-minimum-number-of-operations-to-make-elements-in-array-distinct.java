class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int repeatIndex=-1;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int currRepeat= map.get(nums[i]);
                
                repeatIndex= Math.max(map.get(nums[i]), repeatIndex);
                map.put(nums[i],i);
            }else{
                map.put(nums[i], i);
            }
        }
        if(repeatIndex==-1) return 0;
        return (repeatIndex+1+2)/3;
    }
}