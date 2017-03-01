
public class DoubleArray {

   public static void doubleArray (int a, int b) {
   byte[][] array = new byte[a][b];

   for (int i = 0; i < a; i++) {
       for (int j = 0; j < b; j++) {
          if (i<=a/2 && (i == j || j == b - (i + 1))) {
          array[i][j] = 1;
          array[i][b - (i + 1)] = 1;
          }
          if (i>a/2 && array[a-(i+1)][j]==1){
          array[i][j]=array[a-(i+1)][j];
          }
       }
   }

       for (int i = 0; i < a; i++) {
          for (int j = 0; j < b; j++) {
          System.out.print(array[i][j]+" ");
          }
            System.out.println();
       }
   }
}



