class KthLargest {

    
    private final PriorityQueue<Integer> priorityQueue;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        priorityQueue = new PriorityQueue<>(Comparator.<Integer>naturalOrder().reversed());
        for(int i: nums) {
            priorityQueue.add(i);
        }
    }

    public int add(int val) {
        priorityQueue.add(val);

        List<Integer> numbersToAddBack = new ArrayList<>();

        for(int i = 0; i < k-1; i++) {
            numbersToAddBack.add(priorityQueue.poll());
        }

        int kthLargest = priorityQueue.peek();

        priorityQueue.addAll(numbersToAddBack);

        return kthLargest;
    }
    
}
