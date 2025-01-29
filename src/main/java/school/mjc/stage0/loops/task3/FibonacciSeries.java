package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0, b = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        series.printFibonacci(10);
    }
}
