package lesson24;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersPairs {
  public static List<Integer> main(String[] args) {
    List<Integer> collect = Stream
            .generate(() -> (int) (Math.random()*10 + 15))
            .limit(50).collect(Collectors.toList());
    return collect;
  }
  }
