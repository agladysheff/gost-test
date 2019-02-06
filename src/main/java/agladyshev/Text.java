package agladyshev;

import java.util.*;
import java.util.stream.Collectors;

public class Text {
    void printWords(String a) {

        String[] b = a
                .replaceAll("[^a-zA-Zа-яА-Я]", " ")
                .split("\\s+");

        Map<String, Long> map = Arrays.stream(b)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        List<Map.Entry<String, Long>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingLong(Map.Entry<String, Long>::getValue).reversed());
        list.forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}
