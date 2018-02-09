// Team Loc'n'Load: Aaron Li, Jackie Li, George Liang
// APCS2 pd08
// HW03 -- I am Still Searching
// 2018-02-01

/****

~~~ ALGO EXPLANATION ~~~

First, check if the desired value is even possibly within the array. This is
done by checking if the desired value is larger than the smallest value of the
array (0, 0), and smaller than the largest value of the array (size - 1, size - 1),
and if it isn't within those parameters, it is not found.

Next, the search begins at the element at the top right, and if that element
is the desired value, its coordinates are returned. Otherwise, the following
decisions take place in the while loop:
* if value at index is smaller than desired value: move down a row
* if value at index is larger than desired value: move left a column

The above two decisions repeat until the value is found and returned, or the loop
exits when the indices are too large or small, and the value is not found.

****/

public class MatrixFinder {
     // Parameters: 2D array, desired value(int)
     // Output: runTime of search() in milliseconds
     public static String search(int[][] arr, int x) {
          int size = arr.length; // stores size of array
          int row = 0; // row counter
          int col = size - 1; // column counter


          // One single iteration = O(n) run time
          while (row < size && col >= 0) { // while row and column are valid
               if (size == 0) { // if size of array is 0, return (-1, -1)
                    return "(-1, -1)";
               }

               // if input is greater than the largest value of the
               // array or less than the smallest value of the array,
               // return (-1, -1)
               if (x > arr[size - 1][size - 1] || x < arr[0][0]) {
                    return "(-1, -1)";
               }

               // if the current index (top-rightmost element) is
               // equal to the input, then return the coordinates
               if (x == arr[row][col]) {
                    return "(" + row + ", " + col + ")";
               } // if input is smaller than value at index, move left a column
               else if (x < arr[row][col]) {
                    col -= 1;
               } // if input is larger than value at index, move down a row
               else if (x > arr[row][col]) {
                    row += 1;
               }
          }
          return "(-1, -1)"; // at this point, the value is not found so (-1, -1)
     }

     //Popualtes a 2D array with n * n elements that increases from left to right and top to bottom
     public static void populate(int[][] arr){
          for (int r = 0; r < arr.length; r++){
               for (int c = 0; c < arr.length; c++){
                    arr[r][c] = (r * 51) + c;
               }
          }
     }



     // Strigifies the 2D arrays
     public static String toString(int[][] arr) {
          String out = "";

          for (int i = 0; i < arr.length; i++) {
               out += "";
               for (int x = 0; x < arr.length; x++) {
                    out += arr[i][x] + " ";
               }
          } out += "\n";
          return out;
     }
}
