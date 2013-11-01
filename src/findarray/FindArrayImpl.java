package findarray;

/**

 * User: cq
 * Date: 5/07/13
 * Time: 10:23 AM

 */
public class FindArrayImpl implements FindArray{

    @Override
    public int findArray(int[] array, int[] subArray) {

        //assuming both arrays must be valid (not null)
        if(array == null || subArray == null) return -1;

        //if array is smaller than subarray, there is no possible match
        if(array.length < subArray.length) return -1;

        int idx = -1;
        int j = 0;
        for(int i = 0 ; i < array.length;i++){

            if(array[i] == subArray[j++]){
                if(idx==-1) idx = i;
                if(j == subArray.length) return idx;
            }
            else {
                idx = -1;
                j = 0;
            }

        }

        if(j < subArray.length) idx = -1;

        return idx;
    }
}
