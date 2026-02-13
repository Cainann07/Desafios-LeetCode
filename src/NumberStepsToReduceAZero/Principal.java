package NumberStepsToReduceAZero;

public class Principal {
    public static int numberOfSteps(int num) {
        int numberSteps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            numberSteps++;
        }
        return numberSteps;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
