class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }

    private List<List<Integer>> kSum(int[] nums, int start, int k, long target) {
        List<List<Integer>> res = new ArrayList<>();
        if (start >= nums.length) return res;

        //long avg = target / k;
        //if (nums[start] > avg || nums[nums.length - 1] < avg) return res;

        if (k == 2) return twoSum(nums, start, target);

        for (int i = start; i < nums.length - k + 1; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; 

            List<List<Integer>> temp = kSum(nums, i + 1, k - 1, target - nums[i]);
            for (List<Integer> t : temp) {
                t.add(0, nums[i]);
                res.add(t);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int start, long target) {
        List<List<Integer>> res = new ArrayList<>();
        int left = start, right = nums.length - 1;

        while (left < right) {
            int currSum = nums[left] + nums[right];

            if (currSum == target) {
                res.add(new ArrayList<>(Arrays.asList(nums[left], nums[right])));
                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) left++;  
                while (left < right && nums[right] == nums[right + 1]) right--; 

            } else if (currSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
