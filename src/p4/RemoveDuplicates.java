package p4;
import java.util.Arrays;
public class RemoveDuplicates {

   public static void main(String[] args) {
      // sorted/unsorted array
      int arr[] = {30, 50, 20, 50, 10, 20, 30, 10, 10, 40}; 
      int i,j,desc;
      // remove duplicates
      int newArr[] = removeDuplicates(arr);
      for (i = 0; i < newArr.length; ++i)   //  'for' loop is used for sorting the numbers in descending order
      {
          for (j = i + 1; j < newArr.length; ++j)
          {
              if (newArr[i] < newArr[j])
              {
                  desc = newArr[i];
                  newArr[i] = newArr[j];
                  newArr[j] = desc;
              }
          }
      }
      
      // display both arrays
      System.out.println("Original array: "
                     + Arrays.toString(arr ));
      System.out.println("After removing duplicates: " 
                     + Arrays.toString(newArr));
   }
   
   // method to remove duplicates from array
   public static int[] removeDuplicates(int[] arr) {
      int index = 1; // index without duplicates 
      
      // loop to iterate the array
      for (int i = 1; i < arr.length; i++) {
         
         // current element
         int element = arr[i];
         
         // check element is in unique
         for(int j=0; j<index; j++) {
            if(arr[j] == element) {
               break;
            }
            
            // when not in unique
            if(j == index-1) {
               arr[index++] = element;
               // index got increased therefore use break
               break;
            }
         }
         
      }
            
      // return new copied array
     // return arr;
      return Arrays.copyOf(arr, index);
   }
}
