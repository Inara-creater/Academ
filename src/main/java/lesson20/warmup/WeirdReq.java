package lesson20.warmup;

public class WeirdReq {
  public int[] generate(int n) {
    int[] ints = new int[n];

    // approach 1
//    int val;
//    if (n%2 == 0) {
//      val = n/2 - 1;
//    } else {
//      val = n/2;
//    }
    // approach 2
//    int val = n/2;
//    if (n%2 == 0) val--;
    // approach 3
//    int val = (n>>1) + (n&1) - 1;
    // approach 4
//    int val = (n>>1) - ((n+1)&1);
    // approach 5
    int val = (n-1) >> 1;

    for (int i = 0; i < n / 2; i++, val--) {
      ints[i] = val;
      ints[n-1-i] = val;
    }
    return ints;
  }
}
