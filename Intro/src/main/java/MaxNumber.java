public class MaxNumber {

    //1 variant:
    public static int maxNumber (int [] number) {
        int count = number.length / 2;
        int k = number.length-1;
        int max = number[0] + number[k];

        for (int i = 1; i < count; i++, k--) {
            int c = number[i] + number[k];
            if (c > max) max = c;
        }
        return max;
    }
    //2 variant
    public static int maxNumber2 (int [] number){
        int count = number.length / 2;
        int k = number.length-1;
        int max = number[0]+number[k];

        for (int j = 1; j<count; j++){
            max = Math.max(number[j]+number[k-j], max);
        }
        return max;
    }

}

