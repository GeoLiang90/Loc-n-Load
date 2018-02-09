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
<<<<<<< HEAD
     // Output: runTime of search() in milliseconds
     public static String search(int[][] arr, int x) {
=======
     // Output: coordinates of the desired value, or (-1, -1) if not found and the runTime of search() in milliseconds
     public static String search(long[][] arr, long x) {
	  long startTime = System.nanoTime();
	  long endTime;
>>>>>>> ae2273c0e2b70593f0fa2e7f719b67074d0d7ba9
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
<<<<<<< HEAD



=======
					       
    //Popualtes a 2D array with n * n elements that increases from left to right and top to bottom 
    public static void populate(long[][] arr){
	long popVal = 0;
	for (int r = 0; r < arr.length; r++){
	    popVal *= 1.1;
       
	    for (int c = 0; c < arr.length; c++){
		arr[r][c] = popVal; 
		popVal += 1;
	    }
	}
    }
	

  
>>>>>>> ae2273c0e2b70593f0fa2e7f719b67074d0d7ba9
     // Strigifies the 2D arrays
     public static String toString(long[][] arr) {
          String out = "";

          for (int i = 0; i < arr.length; i++) {
               out += "";
               for (int x = 0; x < arr.length; x++) {
                    out += arr[i][x] + " ";
               }
          } out += "\n";
          return out;
     }
<<<<<<< HEAD
=======

     /* | 5 8 10 |
        | 6 9 11 |
       |11 14 17 |
     */
     public static void main(String[] args) {

          // Test 1
          long[][] test = new long[3][3];
          for (int i = 0; i < 3; i++) {
               for (int x = 0; x < 3; x++) {
                    test[i][x] = (i * 2) + x;
               }
          }
          System.out.println("~~Test 1~~");
          System.out.println(toString(test));
          System.out.println("Search: 3: " + search(test, 3)); // should return (1, 1)
          System.out.println("Search: 4: " + search(test, 4)); // should return (1, 2)
          System.out.println("Search: 7: " + search(test, 7)); // should return (-1, -1)

          // Test 2
          long[][] test1 = new long[2][2];
          for (int i = 0; i < 2; i++) {
               for (int x = 0; x < 2; x++) {
                    test1[i][x] = (i * 2) + x;
               }
          }
          System.out.println("\n~~Test 2~~");
          System.out.println(toString(test1));
          System.out.println("Search: 8: " + search(test1, 8)); // should return (-1, -1)
          System.out.println("Search: 3: " + search(test1, 3)); // should return (1, 1)

          // Test 3
          long[][] test2 = new long[1][1];
          for (int i = 0; i < 1; i++) {
               for (int x = 0; x < 1; x++) {
                    test2[i][x] = (i * 2) + x;
               }
          }
          System.out.println("\n~~Test 3~~");
          System.out.println(toString(test2));
          System.out.println("Search: 1: " + search(test2, 1)); // should return (-1, -1)
          System.out.println("Search: 0: " + search(test2, 0)); // should return (0, 0)

          // Test 4
          long[][] test3 = new long[8][8];
          for (int i = 0; i < 8; i++) {
               for (int x = 0; x < 8; x++) {
                    test3[i][x] = (i * 2) + x;
               }
          }
          System.out.println("\n~~Test 4~~");
          System.out.println("\nNOTE: the printed array doesn't look rectangular, but it is just misalligned");
          System.out.println(toString(test3));
          System.out.println("Search: 21: " + search(test3, 21)); // should return (7, 7)
          System.out.println("Search: 17: " + search(test3, 17)); // should return (5, 7)
          System.out.println("Search: 23: " + search(test3, 23)); // should return (-1, -1)

	  // Test 5 
	  /*long[][] test4 = new long [20000][20000];
	  System.out.println("\n~~Test 5~~");
          System.out.println("\nNOTE: the printed array doesn't look rectangular, but it is just misalligned");
	  populate(test4);
	  //System.out.println(toString(test4));
	  System.out.println("Search: 100000000: " + search(test4, 18));
	  */
	  //generator
	  for (int n = 0; n < 1001; n++) {
	      long[][] ary = new long[n][n];
	      System.out.println("This is array " + n);
	      populate(ary);
	      //System.out.println(toString(ary));
	      System.out.println("Search: 0 " + n + search(ary, 0));
	      }
	  /*long[][] ary = new long[150][150];
	  populate(ary);
	  //System.out.println(toString(ary));
	  System.out.println("Search: 30 " + search(ary, 30));
	  */
     }
>>>>>>> ae2273c0e2b70593f0fa2e7f719b67074d0d7ba9
}
