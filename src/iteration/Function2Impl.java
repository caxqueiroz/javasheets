package iteration;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 1:36 PM
 */
public class Function2Impl<T, U, R> implements Function2<T, U, R> {

    @Override
    public R apply(T t, U u) {

        if(!(t instanceof  Integer) && !(u instanceof  Integer))
            throw new IllegalArgumentException("Only Integer objects supported");

        Integer o0 = (Integer) t;
        Integer o1 = (Integer) u;

        return (R) (new Integer(o0.intValue() + o1.intValue()));
    }
}
