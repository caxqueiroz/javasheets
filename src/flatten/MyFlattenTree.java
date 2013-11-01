package flatten;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 3:27 PM
 */
public class MyFlattenTree<T> implements FlattenTree<T> {



    @Override
    public List<T> flattenInOrder(Tree<T> tree) {
        if(tree == null)
            throw new IllegalArgumentException();

        final List<T> returnList = new LinkedList<T>();
        final Queue<Tree<T>> visited = new LinkedList<Tree<T>>();
        final  Queue<Tree<T>> head = new LinkedList<Tree<T>>();
        head.add(tree);

        while(tree !=null){

            //Leaf
            if(tree.get().isLeft()){
                returnList.add(tree.get().ifLeft(new Function<T, T>() {
                    @Override
                    public T apply(T t) {
                        return t;
                    }
                }));

                visited.add(tree);
                //head element could not be leaf.
                if(head.element().get().isLeft()) tree = null;
                else tree = head.element();

            }else { //Node

                Tree<T> next = tree.get().ifRight(new Function<Triple<Tree<T>>, Tree<T>>() {


                    @Override
                    public Tree<T> apply(Triple<Tree<T>> treeTriple) {

                        if(!visited.contains(treeTriple.left())){
                            if(treeTriple.left() == null) {
                                if(treeTriple.middle() == null){
                                    if(treeTriple.right() == null){
                                        visited.add(head.element());
                                        return head.element();
                                    }else{
                                        return treeTriple.right();
                                    }
                                }else{
                                    return treeTriple.middle();
                                }
                            } else return treeTriple.left();
                        } else if(!visited.contains(treeTriple.middle())){
                            if(treeTriple.middle() == null) {
                                if(treeTriple.right() == null){
                                    visited.add(head.element());
                                    return head.element();
                                }else{
                                    return treeTriple.right();
                                }

                            } else return treeTriple.middle();
                        } else if(!visited.contains(treeTriple.right())){
                            if(treeTriple.right() == null){
                                visited.add(head.element());
                                return head.element();
                            }
                            else return treeTriple.right();
                        }
                        else return null;
                    }
                });


                if(next == null){
                    if(!visited.contains(tree)) {
                        visited.add(tree);
                        tree = head.element();
                    }else tree = null;

                }else if(!visited.contains(next)){
                    tree = next;
                }else {
                    tree = null;
                }

            }

        }
        return returnList;
    }


}
