package Other;

public class RandomString {

    public String process(String str, String strSet) {
        String[] strArr = str.split("");
        String result = "";

        for(int i = 0; i < strArr.length; i++) {
            if (strSet.contains(strArr[i])) {
                result += strArr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "absdefghigkAOUEIlmnopqFGHFTGFCXZWRGldLML";
        String vowels = "aeiou";
        String consonants = "bcdfghgklmnpqrstvwxyz";

        System.out.println(str);

        RandomString rs = new RandomString();
        System.out.println(rs.process(str, vowels));
        System.out.println(rs.process(str, consonants));
        System.out.println(rs.process(str, vowels.toUpperCase()));
        System.out.println(rs.process(str, consonants.toUpperCase()));

    }

}
