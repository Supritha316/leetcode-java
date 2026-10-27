class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<3){
            return Collections.max(list);
        }
        return list.get(list.size()-3);
    }
}