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


        Employee.employeeData();
        Employee.printSumSalary();
        Employee.thеSmallestSalary();
        Employee.thеBiggestSalary();
        Employee.everageSallary();
        Employee.fioEmployees();

    }
}