class Solution {
    public String reversePrefix(String s, int k) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i= 0; i<k ; i++){
            stack.push(s.charAt(i)-'0');
        }
        while(!stack.isEmpty()){
            sb.append((char) (stack.pop()+'0'));
        }
        for(int i= k; i<s.length() ; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}