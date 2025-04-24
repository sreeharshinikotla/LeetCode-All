class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
         for(int val : nums){
            set.add(val);
        }
        int k = set.size();
        int l = 0;
        int r = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r < nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size() == k){
                count += (nums.length - r);
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            r++;
        }
        return count;
    }
}
