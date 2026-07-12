class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a-b));

        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int[] res = new int[arr.length];

        HashMap<Integer,Integer> map = new HashMap<>();

        // prority Queue same value ko bhi alag samjhta hai(100-1,100-2,100-3)
        int rank = 1;
        while (!pq.isEmpty()) {
            int j = pq.poll();
            // Only assign the rank and increment if the element isn't already in the map
            if (!map.containsKey(j)) {
                map.put(j, rank);
                rank++;
            }
        }

        for(int i =0 ; i<arr.length; i++){
            int j = arr[i];
            arr[i] = map.get(j);
        }
        
        return arr;
    }
}