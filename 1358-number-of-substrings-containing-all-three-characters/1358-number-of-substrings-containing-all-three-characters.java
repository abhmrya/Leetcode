class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int lasta = -1;
        int lastb = -1;
        int lastc  = -1;
        for(int i =0; i<s.length(); i++){   
            char ch = s.charAt(i);
            if(ch=='a') lasta = i;
            if(ch=='b') lastb = i;
            if(ch=='c') lastc = i;

            if(lasta!=-1 && lastb != -1 && lastc != -1){
                count+=1+Math.min(lasta,Math.min(lastb,lastc));
            } 
        }
        return count;
    }
}