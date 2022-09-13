public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        Employee emp1 = new Employee("Александров Александр Александрович", 1, 30000);
        Employee emp2 = new Employee("Борисов Борис Борисович", 1, 31000);
        Employee emp3 = new Employee("Владимиров Владимир Владимирович", 2, 32000);
        Employee emp4 = new Employee("Григорьев Григорий Григорьевич", 2, 32000);
        Employee emp5 = new Employee("Дмитриев Дмитрий Дмитриевич", 3, 34000);
        Employee emp6 = new Employee("Евгеньев Евгений Евгеньевич", 3, 32000);
        Employee emp7 = new Employee("Жанов Жан Жанович", 4, 30000);
        Employee emp8 = new Employee("Захаров Захар Захарович", 4, 31000);
        Employee emp9 = new Employee("Игорев Игорь Игоревич", 5, 36000);
        Employee emp10 = new Employee("Константинов Константин Константинович", 5, 32000);

        employee[0] = emp1;
        employee[1] = emp2;
        employee[2] = emp3;
        employee[3] = emp4;
        employee[4] = emp5;
        employee[5] = emp6;
        employee[6] = emp7;
        employee[7] = emp8;
        employee[8] = emp9;
        employee[9] = emp10;

        employeeData();
        printSumSalary();
        printSmallSalary();
        printBigSalary();
        printEverageSallary();
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
        for (Employee employee : employee) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static void printSumSalary() {
        System.out.println("сумма затрат на зарплаты в месяц: " + sumSalary());

    }

    public static Employee smallSalary() {
        Employee result = employee[0];
        int minSalary = employee[0].getSalary();
        for (Employee e : employee){
            if (e.getSalary() < minSalary){
                minSalary = e.getSalary();
                result = e;
            }
        }
        return result;


    }



    public static Employee bigSalary(){
        Employee result = employee[0];
        int maxSalary = employee[0].getSalary();
        for (Employee e : employee){
            if (e.getSalary() > maxSalary){
                maxSalary = e.getSalary();
                result = e;
            }
        }
        return result;
    }
    public static void printBigSalary() {
        System.out.println("максимальная зарплата  " + bigSalary().getSalary());}
    public static void printSmallSalary() {
        System.out.println("минимальная зарплата  " + smallSalary().getSalary());}

    public static float everageSallary() {
        return sumSalary() / (float)employee.length;
    }
    public static void printEverageSallary() {
        System.out.println("средняя зарплата   " + everageSallary());}

    public static void fioEmployees() {
        for (Employee i : employee) {
            System.out.println("Ф.И.О сотрудника: " + i.getFullName());
        }
    }



    }