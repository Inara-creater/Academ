package Other.FromLessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
public class WarmUp16 {
    public static void main(String[] args) {
        List<String> subjects = list("Noel ","The cat ", "The dog");
        List<String> verbs = list("wrote ", "chased ", "slept on ");
        List<String> objects = list("The book ", "The ball ", "The bed ");
        WarmUp16 app = new WarmUp16();
        app.solution(subjects, verbs, objects).forEach(System.out::println);
    }
    private static<T> List<T> list(T... strings) {
        return Arrays.asList(strings);
    }
        private List<String> solution(List<String> subjects,
                                      List<String> verbs,
                                      List<String> objects){
            ArrayList<String> outcome = new ArrayList<>();
            for (int i = 0; i < subjects.size(); i++) {
                for (int j = 0; j < verbs.size(); j++) {
                    for (int k = 0; k < objects.size(); k++) {
                        outcome.add(combine(subjects.get(i), verbs.get(j), objects.get(k)));
                    }
                }
            }return outcome;
        }
        public static<T> String combine(T... combinations) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            for (T words : combinations) stringJoiner.add(words.toString());
            return stringJoiner.toString();
        }}