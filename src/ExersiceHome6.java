public class ExersiceHome6 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int counter =0;
        int value = Math.min(arr1.length, arr2.length);
        int[] arr3 = new int[value];
        int [] arr4 = new int[value];
        int k=0;
        for (int i=0;i< arr1.length;i++)
        {
            for (int j= 0;j< arr2.length;j++)
            {
                if (arr1[i] == arr2[j])
                {
                    arr3[k] = arr1[i];
                    k++;

                }
            }
        }
        arr4 = removeDuplicates(arr3);
        return arr4;
    }
    public static int[] removeDuplicates(int[] arr)
    {

        int end = arr.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        return whitelist;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 50, 40, 60, 79, 60, 53};
        int[] arr2 = {10, 55, 11, 53, 79, 60, 53};
       int[] arr3 = intersection(arr1, arr2);
       for (int i=0;i< arr3.length;i++){
           System.out.print(arr3[i] + ",");
       }


    }

}
