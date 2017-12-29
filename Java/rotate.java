class Solution {
    public void rotate(int[] nums, int k) {
          if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];

        System.arraycopy(nums, nums.length - k, result, 0, k);
//        for (int i = 0; i < k; i++) {
//            result[i] = nums[nums.length - k + i];
//        }

        System.arraycopy(nums, 0, result, k, nums.length - k);
//        for (int i = k; i < nums.length; i++) {
//            result[i] = nums[i-k];
//        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}
