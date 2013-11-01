package findcommonancestor;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 5:04 PM
 */
public interface FindCommonAncestor {

    public String findCommmonAncestor(String[] commitHashes, String[][] parentHashes, String commitHash1, String commitHash2);
}
