
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

    // Create two arrays whose length is equal to the length of the original array (array / 2) and the remaining length.
    int mid = array.length / 2;
    int[] left = new int[mid]; 
    int[] right = new int[array.length - mid];
    
   // Copy the values ​​of the original array to left and right
    System.arraycopy(array, 0, left, 0, mid); // (Data source, from which index to start copying, where to copy, from which index to start inserting into the left, up to which index to copy)
    System.arraycopy(array, mid, right, 0, array.length - mid); // Same thing, but here we start from the middle
    
   // Recursion. Repeat until there is one value left per array. This is determined by the condition on line 12.
    mergeSort(right);
    mergeSort(left);
// Sort and merge from left and right into the original array
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
