public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        Employee e1 = new Employee("E001", "Keerthana", "Developer", 60000);
        Employee e2 = new Employee("E002", "Rajesh", "Designer", 55000);
        Employee e3 = new Employee("E003", "Anjali", "Manager", 80000);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);

        manager.displayAllEmployees();

        System.out.println("\nSearching for E002:");
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? found : "Employee not found.");

        System.out.println("\nDeleting E001:");
        manager.deleteEmployee("E001");

        manager.displayAllEmployees();
    }
}
