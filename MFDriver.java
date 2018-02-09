public class MFDriver {

     public static void main(String[] args) {
          // Tests

          String out = "";
          int[][] tester;
          int avg = 0;

          for (int i = 7000; i < 13001; i+= 20) {
               out = "";
               avg = 0;
               tester = new int[i][i];
               MatrixFinder.populate(tester);
               out += tester.length + ",";
               int worst = tester[tester.length - 1][0];

               long start = System.nanoTime();
               for (int x = 0; x < 1000; x++) {
                    MatrixFinder.search(tester, tester[tester.length - 1][1]);
               }
               long end = System.nanoTime();

               avg += (end - start);
               avg /= 1000;
               out += "" + avg;
               System.out.println(out);
          }
     }
}
