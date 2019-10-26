package Other;

import java.util.*;
public class GFG {
        public static List<Character>
        convertStringToCharList(String str)
        {
            List<Character> chars = new ArrayList<>();
            for (char ch : str.toCharArray()) {

                chars.add(ch);
            }
            return chars;
        }
        public static void main(String[] args)
        {
            String str = "good morning";
            List<Character>
                    chars = convertStringToCharList(str);
            System.out.println(chars);
        }
    }

