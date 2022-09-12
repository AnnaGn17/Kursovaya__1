public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Александров Александр Александрович", 1, 30000);
        employee[1] = new Employee("Борисов Борис Борисович", 1, 31000);
        employee[2] = new Employee("Владимиров Владимир Владимирович", 2, 32000);
        employee[3] = new Employee("Григорьев Григорий Григорьевич", 2, 32000);
        employee[4] = new Employee("Дмитриев Дмитрий Дмитриевич", 3, 34000);
        employee[5] = new Employee("Евгеньев Евгений Евгеньевич", 3, 32000);
        employee[6] = new Employee("Жанов Жан Жанович", 4, 30000);
        employee[7] = new Employee("Захаров Захар Захарович", 4, 31000);
        employee[8] = new Employee("Ибрагимов Ибрагим Ибрагимович", 5, 31000);
        employee[9] = new Employee("Константинов Константин Константинович", 5, 32000);

        employeeData();
        printSumSalary();
        thеSmallestSalary();
        thеBiggestSalary();
        everageSallary();
        fioEmployees();

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
        System.out.println("сумма затрат на зарплаты в месяц: " + sumSalary());

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