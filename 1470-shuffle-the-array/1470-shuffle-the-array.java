class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] result=new int[nums.length];
        for(int m=0;m<n;m++){
            result[2*m]=nums[i++];
            result[2*m+1]=nums[j++];
        }
        return result;
    }
}