class Solution {
    int GDC(int a, int b){
        
        while(a!=0){
           int temp = a;
            a = b%a;
            b=temp;
        }
        return b;
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*n-n;
        if(n==1) return 1;        
        // for(int i =1; i<=2*n; i++){
        //     if(i%2==0){
        //         // sumEven+=i;
        //     }else{
        //         sumOdd+=i;
        //     }
        // }

        return GDC(sumOdd,sumEven);
    }
}