public class TaskTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T101", "Design module", "Pending"));
        manager.addTask(new Task("T102", "Develop backend", "In Progress"));
        manager.addTask(new Task("T103", "Write test cases", "Pending"));

        manager.displayTasks();

        System.out.println("\nSearching for T102:");
        Task result = manager.searchTask("T102");
        System.out.println(result != null ? result : "Task not found.");

        System.out.println("\nDeleting T101:");
        manager.deleteTask("T101");

        manager.displayTasks();
    }
}
