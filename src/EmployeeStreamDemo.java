import java.util.List;

public class EmployeeStreamDemo {


    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee("leo" , 26 , Employee.GENDER.MALE),
                new Employee("Harvey" ,20 , Employee.GENDER.MALE),
                new Employee("Qee", 50 , Employee.GENDER.FEMALE)
        );

        /**
         * 透過stream加總起來
         */
        Integer sum = employeeList.stream()
                .filter(employee -> Employee.GENDER.MALE.equals(employee.getGender()))
                .mapToInt(Employee::getAge)
                .sum();

        //System.out.println(sum);

        /**
         * 透過stream 求平均
         */
        double average = employeeList.stream()
                .filter(employee -> Employee.GENDER.MALE.equals(employee.getGender()))
                .mapToInt(Employee::getAge)
                .average()
                .getAsDouble();

        //System.out.println(average); (26+20)/2 = 23.0


        var max = employeeList.stream()
                .filter(employee -> Employee.GENDER.MALE.equals(employee.getGender()))
                .mapToInt(Employee::getAge)
                .max()
                .getAsInt();

        //System.out.println(max); 26

        List.of(sum,average,max).forEach(System.out::println);




    }




}
