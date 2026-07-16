class Solution {
    long GDC(long a,long b){
        while(a!=0){
            long temp=  a;
            a  =  b % a;
            b=temp;
        }
        return b;
    }

    
    public long gcdSum(int[] nums) {

        long[] prefixGcd = new long[nums.length];

        long mxi=nums[0];
        for(int i =0; i<nums.length; i++){
            if(nums[i]>mxi){
                mxi=nums[i];
            }
            prefixGcd[i] = GDC(nums[i],mxi);

        }
        Arrays.sort(prefixGcd);
        long sum =0;
        int i =0;
        int j =nums.length-1;
        while(i<j){
            sum+=GDC(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}