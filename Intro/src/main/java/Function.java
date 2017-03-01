
public class Function {

        public static void function(int start, int end, int stride){

            System.out.printf("%-8s%c%8s%n","Argument", '|', "Функция");
            System.out.println("--------|----------");

            if (start<end){
            for (int i=start; i<=end; i+=stride){
                double k = Math.tan(2*i)-3;
                System.out.printf("%4d%5c%8.3f%n", i,'|', k);
            }
        }
        else for (int i=start; i>=end; i-=stride){
                double k = Math.tan(2*i)-3;
                System.out.printf("%4d%5c%8.3f%n", i,'|', k);
            }
        }
}

