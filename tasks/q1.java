
public class q1 {
    public static void main(String[] args) {
       int[] arr = {12, 2, 1, 43, 6};
        mergeSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
  
}
   public static void mergeSort(int[] array){
    if (array.length < 2) {
        return;
    };

    // Создаём два массива длинна, которых равна длинне изначального массива(array / 2) и оставшейся длинне.
    int mid = array.length / 2;
    int[] left = new int[mid]; 
    int[] right = new int[array.length - mid];
    
    // Копируем значения изначального массива в left и ritghy
    System.arraycopy(array, 0, left, 0, mid); // (Источник данных, с какого индекса начать копировать, куда копировать, с какого индекса начать вставлять в left, до какого индекса копировать)
    System.arraycopy(array, mid, right, 0, array.length - mid); // Тоже самое, но здесь мы начинаем с середины
    
    // Рекурсия. Повторяем до тех пока не останется по одному значению на массив. За это отвечает условие на 12 строке
    mergeSort(right);
    mergeSort(left);

    // Сортируем и объединяем из left и right в изначальный массив(array)
    merge(array, left, right);
   }

   public static void merge(int[] array, int[] left, int[] right){
    int l = 0, r = 0, a = 0;

    while (l < left.length && r < right.length) {
        if (left[l] <= right[r]) {
            array[a++] = left[l++];
        } else{
            array[a++] = right[r++];
        }
    }

    while (l < left.length) {
        array[a++] = left[l++];
    }
    while (r < right.length) {
        array[a++] = right[r++];
    }

   }

}
