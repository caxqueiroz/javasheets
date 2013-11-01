package iteration;

import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**

 * User: cq
 * Date: 5/07/13
 * Time: 1:41 PM

 */
public class FolderTest {

    @Test
    public void testFolder0() {
        Folder<Integer,Integer> f = new MyFolder<Integer,Integer>();
        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();

        Assert.assertEquals(new Integer(5),f2.apply(new Integer(2), new Integer(3)));

        Queue<Integer> q = new LinkedList<Integer>();
        Random r = new Random(1);

        for(int i = 0 ; i < 5; i++){

            q.add(r.nextInt(10));
        }
        Assert.assertEquals(new Integer(30),f.fold(3,q,f2));

    }
    @Test
    public void testFolder0Compare() {
        Folder<Integer,Integer> f = new MyFolder<Integer,Integer>();
        Folder<Integer,Integer> fr = new MyFolderRec<Integer, Integer>();
        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();

        Assert.assertEquals(new Integer(5),f2.apply(new Integer(2), new Integer(3)));

        Queue<Integer> q = new LinkedList<Integer>();
        Random r = new Random(1);

        for(int i = 0 ; i < 5; i++){

            q.add(r.nextInt(10));
        }
        Assert.assertEquals(new Integer(30),f.fold(3,q,f2));
        Assert.assertEquals(new Integer(30),fr.fold(3,q,f2));


    }

    @Test
    public void testFolderCheckBothSolutions() {
        Folder<Integer,Integer> f = new MyFolder<Integer,Integer>();
        Folder<Integer,Integer> fr = new MyFolderRec<Integer, Integer>();
        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();

        Queue<Integer> q = new LinkedList<Integer>();
        Random r = new Random(1);
        int size = 100;
        for(int i = 0 ; i < size; i++){
            q.add(r.nextInt(size * size));
        }

        Assert.assertEquals(f.fold(3,q,f2),fr.fold(3,q,f2));


    }

    @Test
    public void testFolder100() {
        Folder<Integer,Integer> f = new MyFolder<Integer,Integer>();
        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();

        Queue<Integer> q = new LinkedList<Integer>();
        Random r = new Random(1);
        int size = 100;
        for(int i = 0 ; i < size; i++){
            q.add(r.nextInt(size * size));
        }
        Assert.assertEquals(new Integer(480059),f.fold(3,q,f2));

    }

    @Test
    public void testFolder100000() {
        Folder<Integer,Integer> f = new MyFolder<Integer,Integer>();
        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();

        Queue<Integer> q = new LinkedList<Integer>();
        Random r = new Random(1);
        int size = 100000;
        for(int i = 0 ; i < size; i++){
            q.add(r.nextInt(size * size));
        }
        Assert.assertEquals(new Integer(1695398066),f.fold(3,q,f2));

    }

//    @Test
//    public void testFolder100000Rec() {
//        Folder<Integer,Integer> f = new MyFolderRec<Integer, Integer>();
//        Function2<Integer,Integer,Integer> f2 = new Function2Impl<Integer, Integer, Integer>();
//
//        Queue<Integer> q = new LinkedList<Integer>();
//        Random r = new Random(1);
//        int size = 100000;
//        for(int i = 0 ; i < size; i++){
//            q.add(r.nextInt(size * size));
//        }
//        Assert.assertEquals(new Integer(1695398066),f.fold(3,q,f2));
//
//    }
}
