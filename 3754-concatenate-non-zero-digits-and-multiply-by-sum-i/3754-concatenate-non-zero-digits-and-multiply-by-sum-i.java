class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0 ;
        long num = 0;
        long j=1;
        while(n>0){
            int rem = n%10;
            sum +=rem;
            if(rem!=0){
                num +=j*rem;
                j=j*10;
            }
            n = n/10;
        }
        return (long) sum*num;
    }
}