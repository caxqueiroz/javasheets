package findcommonancestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 5:05 PM
 */
public class FindCommonAncestorImpl implements FindCommonAncestor {

    @Override
    public String findCommmonAncestor(String[] commitHashes, String[][] parentHashes, String commitHash1, String commitHash2) {
        if(commitHashes == null || parentHashes == null || commitHash1 == null || commitHash2 == null) throw new IllegalArgumentException("");

        int c1Index = findIndex(commitHash1,commitHashes);
        int c2Index = findIndex(commitHash2,commitHashes);
        List<Integer> listC1 = buildList(c1Index,commitHashes,parentHashes);
        List<Integer> listC2 = buildList(c2Index,commitHashes,parentHashes);
        listC1.retainAll(listC2);
        return commitHashes[Collections.min(listC1)];

    }

    public List<Integer> buildList(int headIndex, String[] commitHashes, String[][] parentHashes){

        List<Integer> list = new LinkedList<Integer>();
        String[] parent = null;
        list.add(headIndex);
        while((parent = parentHashes[headIndex])!=null){
            headIndex = findIndex(parent[0],commitHashes);
            list.add(headIndex);
        }

        return list;
    }

    public int findIndex(String commit, String[] commitHashes){

        for (int i = 0; i < commitHashes.length; i++){
            if(commitHashes[i].equals(commit))
                return i;
        }
        return -1;
    }
}
