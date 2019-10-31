package Other.FromLessons;

public class Lesson4 {
    static String aZ(int n) {
    String aZ = "ABCDEFGHIGKLMNOPQRSTUVWXYZ" + "abcdefghigklmnopqrstuvwxyz";
    StringBuilder sB = new StringBuilder(n);
    for (int i = 0; i < n; i++) {
        int ZZ = (int) (aZ.length()* Math.random());
        sB.append(aZ.charAt(ZZ));
    }
    return sB.toString();
    }

    public static void main(String[] args) {
        int n = 26;
        System.out.println(Lesson4.aZ(n));
    }
}
