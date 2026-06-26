class Solution {

    boolean toCheck(int[] s,int[] p){
        for(int i=0;i<s.length ;i++){
            if(s[i]!=p[i]){
                return false;
            }
        }
        return true;
    }


    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int[] arrp = new int[26];

        for(int j = 0; j <p.length();j++){
            arrp[p.charAt(j)-'a']++;
        }

        for(int i =0 ; i <= s.length()-p.length();i++){
            int[] arrs = new int[26];
            for(int j = 0; j <p.length();j++){
                arrs[s.charAt(i+j)-'a']++;
            }
            if(toCheck(arrs,arrp)){
                    list.add(i);
            }
        }
        return list;
    }
}