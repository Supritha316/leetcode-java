class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int i = 0;
        int n = 1;

        while (candies > 0) {
            int x = Math.min(candies, n);
            arr[i] += x;
            candies -= x;
            n++;
            i = (i + 1) % num_people;
        }

        return arr;
    }
}