class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue  =  new LinkedList<>();

        for(int i =1 ; i<=n ;i++){
            queue.add(i);
        }

        while(!queue.isEmpty() && queue.size()>1){
            int count = 1;
            while(count<k){
                queue.add(queue.poll());
                count++;
            }
            queue.poll();
        }
        return queue.peek();
    }
}