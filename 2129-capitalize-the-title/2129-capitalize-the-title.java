class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String result ="";
        String[] words = title.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length()<3){
                result+=words[i]+" ";
            }else{
                result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1) + " ";
            }
        }
        return result.trim();
    }
}