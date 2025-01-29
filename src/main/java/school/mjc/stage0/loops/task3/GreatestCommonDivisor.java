package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (first != 0 && second != 0) {
            if (first > second) {
                first = first % second;
            } else {
                second = second % first;
            }
        }
        int gcd = first + second;
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        gcd.printGCD(462, 1071);
    }
}
