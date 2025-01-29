package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        String number = String.valueOf(lengthOfLastNumber);
        for (int k = 1; k <= lengthOfLastNumber; k++) {
            //long n = (long) Math.pow(10, k);
            String nines = number.repeat(k);
            long numbers = Long.parseLong(nines);
        }
    }
}
