import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        var random = new Random();
        var strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        var numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        var integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        System.out.println("列表: " +strings);
        var count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("空字符串数量为: " + count);
        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("字符串长度为 3 的数量为: " + count);
        var filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表: " + filtered);
        var mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
        var squaresList = numbers.stream().map(i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("列表: " +integers);
        var stats = integers.stream().mapToInt((x) ->x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
        System.out.println("随机数: ");
        random.ints().limit(10).sorted().forEach(System.out::println);
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串的数量为: " + count);
    }
}
