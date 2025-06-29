public class TaskManager {
    private TaskNode head;

    // Add a new task to the end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + task);
    }

    // Search a task by ID
    public Task searchTask(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId().equalsIgnoreCase(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and display all tasks
    public void displayTasks() {
        System.out.println("\n--- Task List ---");
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.task.getTaskId().equalsIgnoreCase(taskId)) {
            head = head.next;
            System.out.println("Deleted task with ID: " + taskId);
            return;
        }

        TaskNode current = head;
        while (current.next != null && 
              !current.next.task.getTaskId().equalsIgnoreCase(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Deleted task with ID: " + taskId);
        } else {
            System.out.println("Task not found.");
        }
    }
}
