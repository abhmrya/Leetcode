class Solution {

    public String invert(String res){
        StringBuilder sb = new StringBuilder();

        for(char ch : res.toCharArray()){
            if(ch=='1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.reverse().toString();
    }

    public char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }
        String res = "0";
        for(int i = 1; i<n; i++){
            String inv = invert(res);
            res = res+"1"+inv;
        }
        return res.charAt(k-1);
    }
}