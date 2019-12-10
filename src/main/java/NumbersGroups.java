import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersGroups {
    public static void main(String[] args) {
                Stream.generate(() -> (int) (Math.random()*51 - 26))
                .limit(50)
                .sorted()
                .collect(Collectors.groupingBy(x ->
                { if (x < - 10)
                return -1;
                if (x > 10)
                    return 1;
                return 0;
                }));
    }
}
