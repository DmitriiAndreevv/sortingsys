public class PyramidSorting {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1, 2};
        //heapifysort(array,10,1);
        heapSort(array);
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");


        }
    }

    public static void heapifysort(int[] array, int heapsize, int i) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        // сравниваем left через if
        if (left < heapsize) {
            if (array[left] > array[max]) {
                max = left;
            }
            //сравниваем right
            if (right < heapsize) {
                if (array[right] > array[max]) {
                    max = right;
                }
                //если произойдет замена
                if (max != i) {
                    int temp = array[i];
                    array[i] = array[max];
                    array[max] = temp;

                    heapifysort(array, heapsize, i);
                }
            }
        }
    }

    public static void heapSort(int[] array) {
        if (array.length == 0)
            return;
        //начинаем строить кучу
        int length = array.length;
        // проходим от первого без ответвлений к корню
        for (int i = array.length / 2 - 1; i >= 0; i--) ;


        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapifysort(array, i, 0);
        }
    }
}