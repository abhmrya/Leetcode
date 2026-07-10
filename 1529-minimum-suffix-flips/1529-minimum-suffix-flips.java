class Solution {
    public int minFlips(String target) {
        String st = "";
        
        for(int i=0; i<target.length(); i++){
            st +="0";
        }
        int is = 0;
        int count = 0;
        for(int i=0; i<target.length(); i++){
            int n = target.charAt(i)-'0';
            if(n!=is){
                if(is==0){
                    is=1;                    
                }else{
                    is=0;
                    
                }
                count++;
            }
        }
        return count;
        
    }
}