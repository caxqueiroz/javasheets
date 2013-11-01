package sort;

/**
 * User: cq
 * Date: 8/07/13
 * Time: 8:47 PM
 */
public class MergeSort {

    public int[] merge(int[] a, int[] b, int size){
        int[] c = new int[size];
        int i = 0,j = 0;
        int a0[] = new int[a.length + 1];
        int b0[] = new int[b.length + 1];
        System.arraycopy(a,0,a0,0,a.length);
        a0[a.length] = Integer.MAX_VALUE;
        System.arraycopy(b,0,b0,0,b.length);
        b0[b.length] = Integer.MAX_VALUE;

        for(int k = 0; k < size ; k++){

            if(a0[i] <= b0[j]){
                c[k] = a0[i];
                i++;
            }else  {
                c[k] = b0[j];
                j++;
            }

        }
        return c;
    }

}
