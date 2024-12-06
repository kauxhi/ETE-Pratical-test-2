class Chef implements Runnable {
    private final OrderQueue orderQueue;
    private final int totalOrders;

    public Chef(OrderQueue orderQueue, int totalOrders) {
        this.orderQueue = orderQueue;
        this.totalOrders = totalOrders;
    }

    @Override
    public void run() {
        for (int i = 1; i <= totalOrders; i++) {
            try {
                Thread.sleep((int) (Math.random() * 3000) + 1000);
                orderQueue.addOrder(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}