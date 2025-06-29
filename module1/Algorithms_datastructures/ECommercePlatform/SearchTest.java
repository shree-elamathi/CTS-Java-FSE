import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] inventory = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shirt", "Clothing"),
            new Product("P103", "Phone", "Electronics"),
            new Product("P104", "Book", "Education"),
            new Product("P105", "Watch", "Accessories")
        };

        // 🔎 Linear Search
        System.out.println("Linear Search for 'Phone':");
        Product result1 = SearchEngine.linearSearch(inventory, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        // 🔍 Binary Search
        Arrays.sort(inventory); // Binary search requires sorted array
        System.out.println("\nBinary Search for 'Phone':");
        Product result2 = SearchEngine.binarySearch(inventory, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
