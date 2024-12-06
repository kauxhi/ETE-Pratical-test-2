public class OrderProcessingSystem {
    public static void main(String[] args) {
        final int MAX_QUEUE_SIZE = 10;
        final int TOTAL_ORDERS = 15;

        OrderQueue orderQueue = new OrderQueue(MAX_QUEUE_SIZE);

        Thread ChefThread = new Thread(new Chef(orderQueue, TOTAL_ORDERS));
        Thread CustomerThread = new Thread(new Customer(orderQueue, TOTAL_ORDERS));

        ChefThread.start();
        CustomerThread.start();

        try {
            ChefThread.join();
            CustomerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}