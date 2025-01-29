package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String strNumber = String.valueOf(t);
        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            sum += digit;
        }
        System.out.println(sum);
    }
}
