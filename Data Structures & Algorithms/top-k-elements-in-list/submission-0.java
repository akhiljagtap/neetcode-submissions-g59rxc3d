class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HASHMAP FOR THE STORING THE FRQ.
        // MAX HEAP FOR HIGHEST ELEM. AT PEEK.

        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
        new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        // now add the element from map to priority queue
        pq.addAll(map.entrySet());
        int[] result = new int[k];
        for(int i=0; i < k; i++){
            result[i] = pq.poll().getKey();
        }
        return result;

    }
}
