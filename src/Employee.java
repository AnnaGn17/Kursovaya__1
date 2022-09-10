public class Employee {
    private String fullName;
    private int section;
    private int salary;
    private static int counter = 1;
    private int id;

    public Employee(String fullName, int section, int salary) {
        this.fullName = fullName;
        this.section = section;
        this.salary = salary;
        this.id = counter++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getSection() {
        return section;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "ФИО: " + fullName + ", отдел: " + section + ", зарплата: " + salary + ", ID: " + id;
    }

    public static void employeeData() {
        for (int i = 0; i < Main.employee.length; i++) {
            System.out.println(Main.employee[i]);
        }
    }

    public static void Print(int print) {
        System.out.println(print);
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : Main.employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void printSumSalary() {
        System.out.println("сумма затрат на зарплаты в месяц: " + Employee.sumSalary());

    }

    public static void thеSmallestSalary() {
        int smallSallary = Main.employee[1].getSalary();
        for (Employee i : Main.employee) {
            if (i.getSalary() < smallSallary) {
                smallSallary = i.getSalary();
            }
        }
        System.out.println("минимальная зарплата: " + smallSallary);
    }

    public static void thеBiggestSalary() {
        int biggSallary = Main.employee[1].getSalary();
        for (Employee i : Main.employee) {
            if (i.getSalary() > biggSallary) {
                biggSallary = i.getSalary();
            }
        }
        System.out.println("максимальная зарплата: " + biggSallary);
    }

    public static void everageSallary() {
        int everage = sumSalary() / Main.employee.length;
        System.out.println("среднее значение зарплат: " + everage);
    }

    public static void fioEmployees() {
        for (int i = 0; i < Main.employee.length; i++) {
            System.out.println("Ф.И.О сотрудника: " + Main.employee[i].getFullName());
        }
    }
}
