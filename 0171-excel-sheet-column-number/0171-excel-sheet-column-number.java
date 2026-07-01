class Solution {
    public int titleToNumber(String columnTitle) {
        double sum = 0;
        int j =0;
        for(int i =columnTitle.length()-1;i>=0;i--){
            System.out.println(columnTitle.charAt(i)-'A'+1);
            int ch = columnTitle.charAt(i)-'A'+1;
            sum = sum+Math.pow(26,j)*ch;
            j++;
        }

        return (int) sum;
    }
}