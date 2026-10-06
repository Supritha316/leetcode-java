class Solution {
    public int findSpecialInteger(int[] arr){
        int n =arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>n/4){
                return arr[i];
            }
        }
        if(count>n/4){
            return arr[n-1];
        }
        return -1;
    } 
}