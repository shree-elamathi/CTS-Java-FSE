import java.util.Arrays;

public class SearchEngine {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by product name (sorted array)
    public static Product binarySearch(Product[] products, String target) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(target);

            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}
