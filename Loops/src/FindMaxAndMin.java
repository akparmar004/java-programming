public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
