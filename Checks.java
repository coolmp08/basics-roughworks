import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Checks {
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();

        List<String> basic = Arrays.asList("abc", "abc1", "abc2", "abc3");
        System.out.println(streamOf(basic).sorted());

    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
