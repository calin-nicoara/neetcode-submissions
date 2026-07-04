class Solution {
   public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Double> distanceHeap = new PriorityQueue<>();
        Map<Double, List<int[]>> distToPoints = new HashMap<>();

        for (int[] point : points) {
            double currentDistanceToOrigin = Math.sqrt(Math.pow(point[0], 2.0) + Math.pow(point[1], 2));
            distanceHeap.add(currentDistanceToOrigin);
            distToPoints.computeIfAbsent(currentDistanceToOrigin, x -> new ArrayList<>());
            distToPoints.get(currentDistanceToOrigin).add(point);
        }

        int[][] result = new int[k][];
        int currentCount = 0;
        while(currentCount < k) {
            Double distance = distanceHeap.poll();
            List<int[]> ints = distToPoints.get(distance);
            for(int i = 0; i < ints.size() && currentCount < k; i++) {
                result[currentCount] = ints.remove(0);
                currentCount++;
            }
        }
        
        return result;
    }
}