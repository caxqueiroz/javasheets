package findcommonancestor;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**

 * User: cq
 * Date: 5/07/13
 * Time: 5:05 PM

 */
public class FindCommonAncestorTest {


    @Test
    public void testFindCommonAncestor(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("B",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }
    @Test
    public void testFindCommonAncestor2(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "E";
        String commit2 = "F";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("E",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor3(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "G";
        String commit2 = "F";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("F",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor4(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "C";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("C",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor5(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "E";
        String commit2 = "F";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("E",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor6(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "G";
        String commit2 = "B";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("B",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor7(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "G";
        String commit2 = "E";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("E",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor8(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "B";
        String commit2 = "A";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("A",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }

    @Test
    public void testFindCommonAncestor9(){
        String[] commits = {"D", "C", "F", "E", "B", "A"};
        String[][] parents ={{"C"},{"B"}, {"E"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";

        FindCommonAncestor fca = new FindCommonAncestorImpl();

        Assert.assertEquals("B",fca.findCommmonAncestor(commits,parents,commit1,commit2));


    }


    @Test
    public void testFindCommonAncestorFindIndex(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";

        FindCommonAncestorImpl fca = new FindCommonAncestorImpl();

        Assert.assertEquals(3,fca.findIndex("D",commits));
        Assert.assertEquals(0,fca.findIndex("G",commits));
        Assert.assertEquals(6,fca.findIndex("A",commits));

    }

    @Test
    public void testFindCommonAncestorFindIndex2(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";

        FindCommonAncestorImpl fca = new FindCommonAncestorImpl();

        Assert.assertArrayEquals(new String[]{"F", "D"}, parents[0]);
        Assert.assertArrayEquals(new String[]{"E"},parents[1]);


    }

    @Test
    public void testFindCommonAncestorBuildList(){
        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";

        FindCommonAncestorImpl fca = new FindCommonAncestorImpl();
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Assert.assertEquals(list,fca.buildList(fca.findIndex(commit1,commits),commits,parents));

        list.clear();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        Assert.assertEquals(list,fca.buildList(fca.findIndex(commit2,commits),commits,parents));

    }

}
