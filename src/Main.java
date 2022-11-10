public class Main {
    public static Employee[] employees = new Employee[10];

    // почему rmployees ?
    //почему в первом void, во втором int  и в третьем просто название класса ?
    public static void listEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int countSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();  // ПОЧЕМУ?
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float countAvarageSalary() {
        return countSalary() / (float) employees.length;
    }

    public static void listEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullNameOfEmployee());
        }
    }
}