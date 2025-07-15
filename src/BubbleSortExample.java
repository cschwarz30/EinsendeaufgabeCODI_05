public class BubbleSortExample {

    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        boolean swapped;
        for(int i=0; i < n; i++){
            swapped = false;
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}