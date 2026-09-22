class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int second = 0;
         while(n!=0){
        int Digit = n%10;
         if(Digit > first){
            second = first;
            first = Digit;
         }
         else if(Digit>second){
            second = Digit;
         }
        n = n/10;
       }
       return first*second;
    }
    
}