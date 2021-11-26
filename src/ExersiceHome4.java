
import java.sql.Array;
public class ExersiceHome4 {
        public static void selectionSort (int[] array)//מיון מערך בחירה
        {
            for (int i=0; i < array.length-1; i++)
            {
                int smallest = i;
                for (int j = i+1; j < array.length; j++)
                    if (array[j] < array[smallest])
                        smallest = j;
                if (smallest != i)
                {
                    int temp = array[smallest];
                    array[smallest] = array[i];
                    array[i] = temp;
                }
            }
        }
        public static void main(String[] args) {
            int[] dupeArray = {12,1,1,1,1,2,3,4,5,5,6,67,77,7,7,7,7,7};

            for (int i = 0; i<dupeArray.length; i++){
                System.out.println( PrintingWithoutDuplicates(dupeArray)[i]);
            }
        }
        public static int[] PrintingWithoutDuplicates (int[] dupeArray){
            selectionSort(dupeArray);
            int[] helpWithoutDupe = new int[dupeArray.length];
            int organWithoutDupe = 1;
            helpWithoutDupe[0]=dupeArray[0];
            for (int i = 1; i < (dupeArray.length); i++){
                if (dupeArray[i-1]!= dupeArray[i]) {
                    helpWithoutDupe[organWithoutDupe] = dupeArray[i];
                    if (dupeArray[i] != 0 ) {
                        organWithoutDupe++;
                    }
                }
            }
            int[] withoutDupe = new int[organWithoutDupe+1];
            for (int i = 0 ; i<organWithoutDupe; i++){
                withoutDupe[i]= helpWithoutDupe[i];
            }
            return withoutDupe;
        }

    }

