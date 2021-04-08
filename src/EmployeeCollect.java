import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import static java.util.stream.Collectors.*;

public class EmployeeCollect {
    /**
     * Collect 和 Join 使用
     * @param args
     */
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("leo", 26, Employee.GENDER.MALE),
                new Employee("Harvey", 20, Employee.GENDER.MALE),
                new Employee("Qee", 50, Employee.GENDER.FEMALE)
        );


        /**
         * Collect
         */
        List<Employee> malesCollect = employees.stream()
                .filter(employee -> employee.getGender().equals(Employee.GENDER.MALE))
                .collect(
                        () -> new ArrayList<>(),
                        (maleLt, person) -> maleLt.add(person),
                        (maleLt1, maleLt2) -> maleLt1.addAll(maleLt2)
                );

        /**
         * Collect 方法參考
         */
        List<Employee> malesCollectByMethod = employees.stream()
                .filter(employee -> employee.getGender().equals(Employee.GENDER.MALE))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        /**
         *  依照getGender 性別分組
         */
        Map<Employee.GENDER, List<Employee>> malesGroupBy = employees.stream()
                .collect(
                        groupingBy(Employee::getGender));

        /**
         * 按照性別分組在取得結果
         */
        Map<Employee.GENDER, List<String>> males = employees.stream()
                .collect(
                        groupingBy(Employee::getGender,
                                mapping(Employee::getName, toList())));

        System.out.println(males);


        //例如，想在依性別分組之後，分別取得男女年齡加總，那可以如下撰寫：

        Map<Employee.GENDER, Integer> malesSum = employees.stream()
                .collect(
                        groupingBy(Employee::getGender,
                                reducing(0, Employee::getAge, Integer::sum))
                );

        //要求得各性別下平均年齡的話，Collectors也有個averagingInt()方法可以使用：

        Map<Employee.GENDER, Double> malesAvg = employees.stream()
                .collect(
                        groupingBy(Employee::getGender,
                                averagingInt(Employee::getAge))
                );

        /**
         * 12.2.4 Join 使用
         */
        String message = String.join("-" , "Java" , "is" , "cool");
        System.out.println(message);

        var joiner = new StringJoiner("-");
        var message2 = joiner.add("Java")
                .add("is")
                .add("cool")
                .toString();
        System.out.println(message2);
    }

}
