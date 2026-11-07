class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder s = new StringBuilder();

        while (a + b + c > 0) {
            if (a >= b && a >= c && !(s.length() >= 2 && s.substring(s.length()-2).equals("aa"))) {
                s.append("a");
                a--;
            }
            else if (b >= a && b >= c && !(s.length() >= 2 && s.substring(s.length()-2).equals("bb"))) {
                s.append("b");
                b--;
            }
            else if (c > 0 && !(s.length() >= 2 && s.substring(s.length()-2).equals("cc"))) {
                s.append("c");
                c--;
            }
            else if (a > 0 && !(s.length() >= 2 && s.substring(s.length()-2).equals("aa"))) {
                s.append("a");
                a--;
            }
            else if (b > 0 && !(s.length() >= 2 && s.substring(s.length()-2).equals("bb"))) {
                s.append("b");
                b--;
            }
            else break;
        }
        return s.toString();
    }
}