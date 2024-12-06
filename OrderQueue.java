import java.util.LinkedList;
import java.util.Queue;

class OrderQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int maxSize;

    public OrderQueue(int size) {
        this.maxSize = size;
    }

    public synchronized void addOrder(int order) throws InterruptedException {
        while (queue.size() == maxSize) {
            wait();
        }
        queue.add(order);
        System.out.println("Order " + order + " added to the queue.");
        notifyAll();
    }

    public synchronized int removeOrder() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int order = queue.poll();
        System.out.println("Order " + order + " removed from the queue.");
        notifyAll();
        return order;
    }
}