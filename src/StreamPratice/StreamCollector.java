package StreamPratice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {

    /**
     * //ctrl + alt + v 快速產生 variable
     * 1.count 數有幾個
     * 2.max(Comparator.comparingInt 求最大值 method reference(Project::getStars) or lambda(p -> p.getStars)
     * 3.collect(Collectors.summingInt(Project::getStars)); 找出加總的star
     * 4.collect(Collectors.averagingInt(Project::getStars));找出平均數Star
     * 5.Collector.joining 連接字符串
     * 6.1  collect(Collectors.reducing (初始值 , 要操作字段 , 行為表達式)(0, Project::getStars, (x, y) -> x + y)
     * 6.2  collect(Collectors.reducing((x, y) -> x + y)) 為reducing也不一定要3個參數，可省前兩個為默認 param1 為stream第一個元素 param2為Stream本身
     */
    public static void main(String[] args) {


        List<Project> projects = Project.buildData();


        Double collect = projects.stream()
                    .collect(Collectors.averagingInt(Project::getStars));

        System.out.println(collect);

        //5.
        System.out.println(Stream.of("Hello" , "Java8" , "Python")
        .collect(Collectors.joining("-->>")));//連接的東西

        //6.1
        Integer collectReducing = projects.stream()
                .collect(Collectors.reducing(0, Project::getStars, (x, y) -> x + y));

        System.out.println("collectReducing 3 param-->>" + collectReducing);

        //6.2
        Optional<Integer> collectReducingNoParam = projects.stream()
                .map(Project::getStars)
                .collect(Collectors.reducing((x, y) -> x + y));

        System.out.println("collectReducingNoParam -->>"+collectReducingNoParam);
    }























}
