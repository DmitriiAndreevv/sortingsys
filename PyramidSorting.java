

public class PyramidSorting {

    public static void main(String[] args) {
        int[] array = new int[]{5,4,3,2,1,2,3};
        heapSort(array);
        //heapifysort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
    public static int heapifysort(int[] array){

        int i = 0;
        int left =  2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        // сравниваем left через if
        if (left < array.length ){
            if (array[left] > array[max]){
                max =  left;
            }
            //сравниваем right
            if (right < array.length){
                if (array[right] > array[max]){
                   max = right;
                }
                //если произойдет замена
                if (max != i){
                    int temp = array[i];
                    array[max] = temp;
                    heapifysort(array);
                }
            }
        }
        return left;
    }
    public static void heapSort(int[]array){
        if (array.length == 0)
            return;
        //начинаем строить кучу
        int length = array.length;
        // проходим от первого без ответвлений к корню
        for (int i = length / 2 -1 ; i > 0; i--) {
            heapifysort(array);

        for (i = length - 1; i >=0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapifysort(array);
            }

        }
    }
}
