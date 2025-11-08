public class q2 {
    public static void main(String[] args) {
       
        int[] arr = {1,4,5,6,8,9};
        int result = binarySearch(arr, 6);
        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден.");
        }
        
}
    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int search = left + (right - left) / 2;

            if (array[search] == target) {
                return search;
            } else if(array[search] < target){
                left = search + 1;
            } else{
                right = search -1;
            }
            
        }
        return -1;
    }
    
   }
