/**
 * Created with IntelliJ IDEA.
 * User: cq
 * Date: 5/07/13
 * Time: 8:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class Confusing {

    public boolean isConfusing(){
        try{
            return true;

        }finally{

            return false;
        }
    }

    public static void main(String[] args){
        Confusing c = new Confusing();
        System.out.println(c.isConfusing());
    }

}
