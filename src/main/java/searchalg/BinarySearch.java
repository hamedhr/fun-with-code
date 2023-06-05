package searchalg;


public class BinarySearch {
    public static int doSearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;
            if(array[middle] == target){
                return middle;
            }else if(array[middle] < target){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
