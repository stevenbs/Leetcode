class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (max < sum) { //if current sum > max, assign max = sum
            max = sum;
        }
        if (sum < 0) { //if current sum < 0 start new sum
            sum = 0;
        }
    }
        return max;
    }
}
