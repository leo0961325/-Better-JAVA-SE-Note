package StreamPratice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  1.collect(Collectors.toMap(Project::getName, Project::getStars)) 由collect轉成map格式
 *  2.Function.identity() 獲取所有屬性值，記得Map改<String , project>
 *  3.collect(Collectors.groupingBy(Project::getAuthor) 類似SQL的GroupBy，這裡按照作者分組
 *  4.collect(Collectors.partitioningBy(StreamCollectorToMap::isBackEnd)  partitioningBy數據分區
 *
 */
public class StreamCollectorToMap {

    // Method 判斷是否為後端語言
    public static boolean isBackEnd(Project project){
        return "java".equalsIgnoreCase(project.getLanguage()) || "python".equalsIgnoreCase(project.getLanguage());
    }

    public static void main(String[] args) {

        List<Project> projects = Project.buildData();

        //1.
        Map<String, Integer> collect = projects.stream()
                .collect(Collectors.toMap(Project::getName, Project::getStars));

        System.out.println(collect);

        //2.
        Map<String, Project> collect1 = projects.stream()
                .collect(Collectors.toMap(Project::getName, Function.identity()));

        System.out.println(collect1);

        //3.
        Map<String, List<Project>> collectGroupBy = projects.stream()
                .collect(Collectors.groupingBy(Project::getAuthor));

        System.out.println(collectGroupBy);
        //4.
        Map<Boolean, List<Project>> isBackEnd = projects.stream()
                .collect(Collectors.partitioningBy(StreamCollectorToMap::isBackEnd));

        System.out.println(isBackEnd);

    }











}
