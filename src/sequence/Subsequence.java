package sequence;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 3:41 PM
 */
public class Subsequence {



    public static boolean isSubsequence(String s, String t) {
        int M = s.length();
        int N = t.length();

        int i = 0;
        for (int j = 0; j < N; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
            if (i == M) return true;
        }
        return false;
    }

    public static int subsequence(String s, String t) {
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

        System.out.println(subsequence("12", "134512"));
        System.out.println(isSubsequence("12", "134512"));
    }

}
