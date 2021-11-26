public class ExersiceHome5 {
    public static int upAndDown(int[] arr) {
        int top = 0;
        int counter = 0;
        int i = 0;
        if(arr[0]>arr[1]){
            top=-1;
        }

        while ((arr[i] < arr[i + 1]) ) {
            i++;
            top++;
            if (i == arr.length) {
                top = -1;
                break;
            }
        }
        if(arr[i] == arr[i+1])
        {
            top = -1;
        }
        for (int j = i; j < arr.length; j++)
        {
            if (j+1 < arr.length)
            {

                if (arr[j] > arr[j + 1])
                {
                    counter++;
                } else if (arr[j] < arr[j + 1])
                {
                    top = -1;
                } else
                {
                    if (arr.length == top + counter)
                    {
                        break;
                    }
                }
            }

        }
            return top;

        }
        public static void main (String[]args){
            int[] array = {0,1,7,9,9,2};
            int ans = upAndDown(array);
            System.out.println(ans);
        }
    }
