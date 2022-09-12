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

    public static void printSumSalary() {
        System.out.println("сумма затрат на зарплаты в месяц: " + Main.sumSalary());

    }
    public String toString() {
        return "ФИО: " + fullName + ", отдел: " + section + ", зарплата: " + salary + ", ID: " + id;
    }



}
