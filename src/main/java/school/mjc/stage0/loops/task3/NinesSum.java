package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum;
        for (sum = 9; lengthOfLastNumber != 0; lengthOfLastNumber = lengthOfLastNumber / 10) {
            sum = sum + lengthOfLastNumber % 10;
        }
        System.out.println(sum);
    }
}
