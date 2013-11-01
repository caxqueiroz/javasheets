/**
 * Created with IntelliJ IDEA.
 * User: cq
 * Date: 5/07/13
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Subsequence {

    public static int isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();

        int i = 0;
        for (int j = 0; j < N; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
            if (i == M) return j - (i - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
//        String s = args[0];
//        String t = args[1];
        System.out.println(isSubsequence("12", "134512"));
    }

}
