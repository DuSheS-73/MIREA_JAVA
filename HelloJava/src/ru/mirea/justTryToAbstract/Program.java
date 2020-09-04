package ru.mirea.p2;

public class Program
{
    public static void main(String[] args)
    {
        Employee[] employeesList = {
                new Employee("David", 27, 3),
                new Employee("Peter", 32, 16),
                new Employee("Mike", 16, 23)
        };

        for (var employee : employeesList)
        {
            employee.displayInfo();
        }
    }
}
