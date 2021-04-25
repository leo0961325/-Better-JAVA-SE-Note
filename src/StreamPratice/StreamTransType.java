package StreamPratice;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;

public class StreamTransType {

    /**
     * 1.轉化為Set類型，也可以直接collect(Collector.toSet())就好比較簡單
     * 2.也可以轉化成ArrayList類型
     * 3.collectingAndThen 轉換函數返還的類型
     */

    public static void main(String[] args) {


        List<Project> projects = Project.buildData();

        //1.
        Collection<Project> collectToSet = projects.stream()
                .collect(Collectors.toCollection(HashSet::new));

        Collection<Project> collectToArrayList = projects.stream()
                .collect(Collectors.toCollection(ArrayList::new));

//        System.out.println(collectToSet);
//        System.out.println(collectToArrayList);
        //2.
        Map<String, Project> collectingAndThen1 = projects.stream()
                .collect(Collectors.groupingBy(Project::getAuthor, collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Project::getStars)),
                        Optional::get
                )));
        System.out.println(collectingAndThen1);
    }








}
