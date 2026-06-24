class Solution {
    boolean checkBalance(int[] arr){
        int fre =0;
        for(int i =0 ;i <arr.length; i++){
            if(arr[i]==0) continue;
            if(fre==0){
                fre=arr[i];
            }else if(fre!=arr[i]){
                return false;
            }
        }
        return true;
    }

    public int longestBalanced(String s) {
        int max=0;
        for(int i =0 ; i<s.length() ; i++){
            int[] arr = new int[26];
            int count=0;
            for(int j =i ; j<s.length(); j++){
                int ch = s.charAt(j)-'a';
                arr[ch]++;
                if(checkBalance(arr)){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}