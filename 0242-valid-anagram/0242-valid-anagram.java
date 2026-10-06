class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] Ch = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(Ch);
        if(Arrays.equals(ch,Ch)){
            return true;
        }
        return false;
    }
}