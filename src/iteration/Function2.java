package iteration;

/**
 * User: cq
 * Date: 5/07/13
 * Time: 1:25 PM
 */
public interface Function2<T, U, R>
{
    public R apply(T t, U u);
}