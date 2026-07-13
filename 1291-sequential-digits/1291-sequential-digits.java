class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> list = new ArrayList<>();
        for(int i =1; i<= 9; i++){
            int sum = 0;
            for(int j =i; j<= 9; j++ ){
                sum=sum*10+j;
                if(sum >=low && sum<=high ){
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        return list;

    }
}