class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0;  i<nums.length; i++){
            int n = nums[i];
            pq.add(n*n);
        }

        int[] arr = new int[nums.length];
        
        int size = pq.size();
        for(int i = 0; i<size; i++){
            arr[i] = pq.poll();
        }

        return arr;
    }
}