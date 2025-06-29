public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Keyboard", 50, 899.99);
        Product p2 = new Product("P102", "Mouse", 100, 499.50);
        Product p3 = new Product("P103", "Monitor", 20, 7999.00);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.displayInventory();

        manager.updateProduct("P102", 120, 479.00);
        manager.deleteProduct("P103");

        manager.displayInventory();
    }
}
