class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        Map<Integer, Long> freqMap = new HashMap<>();
        freqMap.put(0, 1L); 

        long count = 0;
        int prefix = 0;

        for (int num : nums) {
            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            } else {
                prefix = prefix % modulo;
            }

            int need = (prefix - k + modulo) % modulo;
            count += freqMap.getOrDefault(need, 0L);

            freqMap.put(prefix, freqMap.getOrDefault(prefix, 0L) + 1);
        }

        return count;
    }
}
