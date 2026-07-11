class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int n = nums.length/2;

        for(int i : nums){
            int n1 = map.getOrDefault(i,0);
            if(n1+1>=n){
                return i;
            }else{
                map.put(i,n1+1);
            }
        }
        return 0;
    }
}