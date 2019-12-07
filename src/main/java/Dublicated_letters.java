import java.util.stream.Collectors;

public class Dublicated_letters {
    public static void main(String[] args) {
        String filtered = "gdheidhui"
                .chars()
                .distinct()
                .mapToObj(value -> String.valueOf((char)value))
                .collect(Collectors.joining());
                System.out.println(filtered);

    }
}
