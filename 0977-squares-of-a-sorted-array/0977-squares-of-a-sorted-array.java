class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        
        int k=nums.length-1;
        int i =0; 
        int j = nums.length-1;

        while(i<=j){
            int n = nums[i]*nums[i];
            int n1 = nums[j]*nums[j];

            if(n>n1){
                arr[k]=n;
                i++;
            }else{
                arr[k]=n1;
                j--;
            }
            k--;
        }
        return arr; 
    }
}