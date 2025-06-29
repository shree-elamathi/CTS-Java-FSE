public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Keerthana", 9500.00),
            new Order("O102", "Rajesh", 1500.00),
            new Order("O103", "Meena", 3000.00),
            new Order("O104", "Vikram", 25000.00),
            new Order("O105", "Anjali", 5500.00)
        };

        System.out.println("Original Orders:");
        OrderSorter.printOrders(orders);

        // 🔁 Bubble Sort
        OrderSorter.bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        OrderSorter.printOrders(orders);

        // Shuffle again for Quick Sort test
        orders = new Order[]{
            new Order("O101", "Keerthana", 9500.00),
            new Order("O102", "Rajesh", 1500.00),
            new Order("O103", "Meena", 3000.00),
            new Order("O104", "Vikram", 25000.00),
            new Order("O105", "Anjali", 5500.00)
        };

        // ⚡ Quick Sort
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        OrderSorter.printOrders(orders);
    }
}
