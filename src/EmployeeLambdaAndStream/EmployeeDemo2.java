package EmployeeLambdaAndStream;

import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * 使用Stream reduce & Collect
 */
public class EmployeeDemo2 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("leo", 26, Employee.GENDER.MALE),
                new Employee("Harvey", 20, Employee.GENDER.MALE),
                new Employee("Qee", 50, Employee.GENDER.FEMALE)
        );


        int sum = employees.stream()
                .filter(employee -> employee.getGender() == Employee.GENDER.MALE)
                .mapToInt(Employee::getAge)
                .
                        reduce((total, age) -> total + age)
                .getAsInt();

        long males = employees.stream()
                .filter(employee -> employee.getGender() == Employee.GENDER.MALE)
                .count();

        int average = (int) (employees.stream()
                        .filter(employee -> employee.getGender() == Employee.GENDER.MALE)
                        .mapToInt(Employee::getAge)
                        .reduce((total, age) -> total + age)
                        .getAsInt() / males);

        /**
         * 找年紀最大的 male 用reduce方法
         */
        int max = employees.stream()
                .filter(employee -> employee.getGender() == Employee.GENDER.MALE)
                .mapToInt(Employee::getAge)
                .reduce(0, (currentMax, age) -> age > currentMax ? age : currentMax);

        List.of(sum,average,max).forEach(System.out::println);

        /**
         * 新JDK 強化filter -> filtering
         */
        List<Employee> malesByFiltering = employees.stream()
                .collect(filtering(
                        employee -> employee.getGender() == Employee.GENDER.MALE ,toList()
                ));
    }

}
