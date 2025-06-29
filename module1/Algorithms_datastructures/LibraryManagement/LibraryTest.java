import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "Java Programming", "James Gosling"),
            new Book("B102", "C Programming", "Dennis Ritchie"),
            new Book("B103", "Python Basics", "Guido van Rossum"),
            new Book("B104", "Algorithms", "Robert Sedgewick"),
            new Book("B105", "Data Structures", "Mark Allen Weiss")
        };

        // 🔎 Linear Search (unsorted)
        System.out.println("Linear Search for 'Python Basics':");
        Book found1 = LibrarySearch.linearSearch(books, "Python Basics");
        System.out.println(found1 != null ? found1 : "Book not found");

        // 🔍 Binary Search (sorted by title)
        Arrays.sort(books); // Required for binary search
        System.out.println("\nBinary Search for 'Python Basics':");
        Book found2 = LibrarySearch.binarySearch(books, "Python Basics");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
