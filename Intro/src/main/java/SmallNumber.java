
public class SmallNumber {

    public static void smallNumber(double e) {
        int i = 1;
        double k = 1 / Math.pow((1 + i), 2);
        if (e < 0) {
            System.out.println("The number should be positive");
        } else {
            while (k > e) {
                i++;
                k = 1 / Math.pow((1 + i), 2);
                System.out.println("For an element of " + i + " is the result of equation" + k);
            }
            if (k < e) {
                System.out.println("The smallest number of the element for which the condition " +
                        "equals " + i);
            } else System.out.println("For an element of " + i + " is the result of equation" + k);
        }
    }
}

