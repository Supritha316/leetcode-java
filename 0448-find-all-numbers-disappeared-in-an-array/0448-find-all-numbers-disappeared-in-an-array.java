class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length + 1];
        for (int n : nums)
            arr[n]++;
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 0)
                res.add(i);
        }
        return res;
    }
}