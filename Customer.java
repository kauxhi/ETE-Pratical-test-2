

class Customer implements Runnable {
    private final OrderQueue orderQueue;
    private final int totalOrders;

    public Customer(OrderQueue orderQueue, int totalOrders) {
        this.orderQueue = orderQueue;
        this.totalOrders = totalOrders;
    }

    @Override
    public void run() {
        for (int i = 1; i <= totalOrders; i++) {
            try {
                int order = orderQueue.removeOrder();
                Thread.sleep((int) (Math.random() * 2000) + 1000);
                System.out.println("Order " + order + " has been prepared.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}