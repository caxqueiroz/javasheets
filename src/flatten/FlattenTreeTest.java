package flatten;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 3:30 PM
 */
public class FlattenTreeTest {

    @Test
    public void testTree(){

        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));

        Tree.Node<Integer> node = new Tree.Node<Integer>(fiveLeaf,fourLeaf,nineLeaf);
        Tree.Node<Integer> root = new Tree.Node<Integer>(oneLeaf,node,sixLeaf);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
        expected.add(5);
        expected.add(4);
        expected.add(9);
        expected.add(6);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }
    @Test
    public void testTree2(){

//        Tree.Leaf<Integer> zeroLeaf = Tree.Node.Leaf.leaf(new Integer(0));
        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));
        Tree.Leaf<Integer> eightLeaf = Tree.Node.Leaf.leaf(new Integer(8));
        Tree.Leaf<Integer> sevenLeaf = Tree.Node.Leaf.leaf(new Integer(7));
        Tree.Leaf<Integer> twelveLeaf = Tree.Node.Leaf.leaf(new Integer(12));
        Tree.Leaf<Integer> fifteenLeaf = Tree.Node.Leaf.leaf(new Integer(15));
        Tree.Leaf<Integer> eigtheenLeaf = Tree.Node.Leaf.leaf(new Integer(18));


        Tree.Node<Integer> node0 = new Tree.Node<Integer>(oneLeaf,fourLeaf,sixLeaf);
        Tree.Node<Integer> node1 = new Tree.Node<Integer>(fiveLeaf,eightLeaf,sevenLeaf);
        Tree.Node<Integer> node2 = new Tree.Node<Integer>(twelveLeaf,fifteenLeaf,eigtheenLeaf);

        Tree.Node<Integer> root = new Tree.Node<Integer>(node0,node1,node2);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(6);
        expected.add(5);
        expected.add(8);
        expected.add(7);
        expected.add(12);
        expected.add(15);
        expected.add(18);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }

    @Test
    public void testTree3(){

        Tree.Leaf<Integer> zeroLeaf = Tree.Node.Leaf.leaf(new Integer(0));
        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));
        Tree.Leaf<Integer> eightLeaf = Tree.Node.Leaf.leaf(new Integer(8));
        Tree.Leaf<Integer> sevenLeaf = Tree.Node.Leaf.leaf(new Integer(7));
        Tree.Leaf<Integer> twelveLeaf = Tree.Node.Leaf.leaf(new Integer(12));
        Tree.Leaf<Integer> fifteenLeaf = Tree.Node.Leaf.leaf(new Integer(15));
        Tree.Leaf<Integer> eigtheenLeaf = Tree.Node.Leaf.leaf(new Integer(18));

        Tree.Leaf<Integer> nineteenLeaf = Tree.Node.Leaf.leaf(new Integer(19));
        Tree.Leaf<Integer> twentyLeaf = Tree.Node.Leaf.leaf(new Integer(20));
        Tree.Leaf<Integer> twentyoneLeaf = Tree.Node.Leaf.leaf(new Integer(21));




        Tree.Node<Integer> node4 = new Tree.Node<Integer>(nineLeaf,eightLeaf,zeroLeaf);
        Tree.Node<Integer> node3 = new Tree.Node<Integer>(nineteenLeaf,twentyLeaf,node4);

        Tree.Node<Integer> node0 = new Tree.Node<Integer>(oneLeaf,fourLeaf,sixLeaf);
        Tree.Node<Integer> node1 = new Tree.Node<Integer>(fiveLeaf,node3,sevenLeaf);
        Tree.Node<Integer> node2 = new Tree.Node<Integer>(twelveLeaf,fifteenLeaf,eigtheenLeaf);


        Tree.Node<Integer> root = new Tree.Node<Integer>(node0,node1,node2);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(6);
        expected.add(5);
        expected.add(19);
        expected.add(20);
        expected.add(9);
        expected.add(8);
        expected.add(0);
        expected.add(7);
        expected.add(12);
        expected.add(15);
        expected.add(18);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }

    @Test
    public void testTree4(){


        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));

        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));

        Tree.Node<Integer> node0 = new Tree.Node<Integer>(oneLeaf,fourLeaf,sixLeaf);





        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(node0));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(6);

        Assert.assertEquals(expected,ft.flattenInOrder(node0));


    }

    @Test
    public void testTree5(){

        Tree.Leaf<Integer> zeroLeaf = Tree.Node.Leaf.leaf(new Integer(0));

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(zeroLeaf));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(0);

        Assert.assertEquals(expected,ft.flattenInOrder(zeroLeaf));


    }

    @Test
    public void testTree6(){

        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));

        Tree.Node<Integer> node = new Tree.Node<Integer>(fiveLeaf,fourLeaf,nineLeaf);
        Tree.Node<Integer> root = new Tree.Node<Integer>(oneLeaf,null,sixLeaf);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
//        expected.add(5);
//        expected.add(4);
//        expected.add(9);
        expected.add(6);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }

    @Test
    public void testTree7(){

        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));

        Tree.Node<Integer> node = new Tree.Node<Integer>(fiveLeaf,fourLeaf,nineLeaf);
        Tree.Node<Integer> root = new Tree.Node<Integer>(null,null,sixLeaf);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
//        expected.add(1);
//        expected.add(5);
//        expected.add(4);
//        expected.add(9);
        expected.add(6);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }

    @Test
    public void testTree8(){

        Tree.Leaf<Integer> oneLeaf = Tree.Node.Leaf.leaf(new Integer(1));
        Tree.Leaf<Integer> sixLeaf = Tree.Node.Leaf.leaf(new Integer(6));
        Tree.Leaf<Integer> fiveLeaf = Tree.Node.Leaf.leaf(new Integer(5));
        Tree.Leaf<Integer> fourLeaf = Tree.Node.Leaf.leaf(new Integer(4));
        Tree.Leaf<Integer> nineLeaf = Tree.Node.Leaf.leaf(new Integer(9));

        Tree.Node<Integer> node = new Tree.Node<Integer>(fiveLeaf,fourLeaf,nineLeaf);
        Tree.Node<Integer> root = new Tree.Node<Integer>(null,null,null);

        FlattenTree<Integer> ft = new MyFlattenTree<Integer>();

        System.out.println(ft.flattenInOrder(root));
        LinkedList<Integer> expected = new LinkedList<Integer>();
//        expected.add(1);
//        expected.add(5);
//        expected.add(4);
//        expected.add(9);
//        expected.add(6);
        Assert.assertEquals(expected,ft.flattenInOrder(root));


    }
}
