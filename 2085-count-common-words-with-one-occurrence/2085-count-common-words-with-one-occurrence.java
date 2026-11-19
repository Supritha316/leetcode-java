class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        for (String s : words1) {
            if (Collections.frequency(Arrays.asList(words1), s) == 1 &&
                Collections.frequency(Arrays.asList(words2), s) == 1) {
                count++;
            }
        }
        return count;
    }
}