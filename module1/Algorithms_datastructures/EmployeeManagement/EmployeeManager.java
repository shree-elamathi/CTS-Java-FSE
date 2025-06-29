public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    // Add employee
    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
            System.out.println("Added: " + e);
        } else {
            System.out.println("Employee list is full!");
        }
    }

    // Search by ID
    public Employee searchEmployee(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(id)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse all
    public void displayAllEmployees() {
        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete by ID
    public void deleteEmployee(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equalsIgnoreCase(id)) {
                // Shift left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
