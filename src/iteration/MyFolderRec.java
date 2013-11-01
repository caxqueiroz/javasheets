package iteration;

import java.util.Queue;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 2:38 PM
 */
public class MyFolderRec <T, U> implements Folder<T, U> {

    @Override
    public U fold(U u, Queue<T> ts, Function2<T, U, U> function) {
        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();

        if (ts.isEmpty()) {
            return u;
        }
        return fold(function.apply(ts.poll(), u), ts, function);

    }

}
