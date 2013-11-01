package iteration;

import java.util.Iterator;
import java.util.Queue;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 1:25 PM
 */

public class MyFolder<T, U> implements Folder<T, U> {

    @Override
    public U fold(U u, Queue<T> ts, Function2<T, U, U> function) {
        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();

        if (ts.isEmpty()) {
            return u;
        }
        U result = u;
        for(Iterator<T> i = ts.iterator(); i.hasNext(); ) {
            result = function.apply(i.next(),result);
        }
        return result;

    }
}
