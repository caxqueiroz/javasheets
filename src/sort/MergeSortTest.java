package sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * User: cq
 * Date: 8/07/13
 * Time: 8:51 PM
 */
public class MergeSortTest {

    @Test
    public void testMerge(){
        int[] a = new int[] {1,4,5,7};
        int[] b = new int[] {2,6,9,11};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,2,4,5,6,7,9,11},ms.merge(a,b,8));

    }

    @Test
    public void testMerge2(){
        int[] a = new int[] {2,4,5,7};
        int[] b = new int[] {1,6,9,11};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,2,4,5,6,7,9,11},ms.merge(a,b,8));

    }

    @Test
    public void testMerge3(){
        int[] a = new int[] {7,9};
        int[] b = new int[] {1,6};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,6,7,9},ms.merge(a,b,4));

    }

    @Test
    public void testMerge4(){
        int[] a = new int[] {7};
        int[] b = new int[] {1,6};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,6,7},ms.merge(a,b,3));

    }

    @Test
    public void testMerge5(){
        int[] a = new int[] {7};
        int[] b = new int[] {1};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,7},ms.merge(a,b,2));

    }

    @Test
    public void testMerge6(){
        int[] a = new int[] {7,7};
        int[] b = new int[] {1,1};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,1,7,7},ms.merge(a,b,4));

    }

    @Test
    public void testMerge7(){
        int[] a = new int[] {7,7,8,9,13,23};
        int[] b = new int[] {1,1};
        MergeSort ms = new MergeSort();

        Assert.assertArrayEquals(new int[] {1,1,7,7,8,9,13,23},ms.merge(a,b,8));

    }

}
