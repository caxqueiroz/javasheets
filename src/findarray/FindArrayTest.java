package findarray;

import org.junit.Assert;
import org.junit.Test;

/**

 * User: cq
 * Date: 5/07/13
 * Time: 12:57 PM

 */
public class FindArrayTest {

    @Test
    public void testFindArray0(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{7,8,9},new int[]{8,9,10}));
    }
    @Test
    public void testFindArray1(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{7,8,9},new int[]{2}));
    }
    @Test
    public void testFindArray2(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(1,fa.findArray(new int[]{1,2,3,4,5},new int[]{2,3}));
    }
    @Test
    public void testFindArray3(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(3,fa.findArray(new int[]{1,2,3,4,5},new int[]{4,5}));
    }
    //[4,9,3,7,8] and [3,7]
    @Test
    public void testFindArray4(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(2,fa.findArray(new int[]{4,9,3,7,8},new int[]{3,7}));
    }
    @Test
    public void testFindArray5(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{4},new int[]{3,7}));
    }

    @Test
    public void testFindArray6(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(null,new int[]{3,7}));
    }

    @Test
    public void testFindArray7(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{4},null));

    }
    @Test
    public void testFindArray8(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(0,fa.findArray(new int[]{4},new int[]{4}));

    }

    @Test
    public void testFindArray9(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{2},new int[]{4}));

    }

    @Test
    public void testFindArray10(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(2,fa.findArray(new int[]{7,8,9},new int[]{9}));
    }

    @Test
    public void testFindArray11(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(-1,fa.findArray(new int[]{7,8,9},new int[]{9,10}));
    }

    @Test
    public void testFindArray12(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(2,fa.findArray(new int[]{7,8,9,10,11,12,13,13,9,10},new int[]{9,10}));
    }

    @Test
    public void testFindArray13(){
        FindArray fa = new FindArrayImpl();
        Assert.assertEquals(8,fa.findArray(new int[]{7,9,8,10,11,12,13,13,9,10},new int[]{9,10}));
    }

}
