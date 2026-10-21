class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1){
             char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            if(Character.toLowerCase(a)==Character.toLowerCase(b) && a != b){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if(i>0)
                   i--;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}