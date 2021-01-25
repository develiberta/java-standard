import java.util.function.*;

/* Exercise 14-1. 메서드를 람다식으로 변환하여 아래의 표를 완성하시오.
 */
class Exercise14_1 {
    public static void main(String[] args) {

        /* (1) */
        IntBinaryOperator func1 =  (int a, int b) -> a > b ? a : b;

        /* (2) */
        BiConsumer<String, Integer> func2 = (s, i) -> System.out.println(s + " = " + i);

        /* (3) */
        IntUnaryOperator func3 = x -> x * x;

        /* (4) */
        IntSupplier func4 = () -> (int)(Math.random() * 6);

        /* (5) */
        Function<int[], Integer> func5 = arr -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        };

        /* (6) */
        Function<Integer, int[]> func6 = int[]::new;
    }

    /* (1) */
    int max(int a, int b) {
        return a > b ? a : b;
    }

    /* (2) */
    void printVar(String name, int i) {
        System.out.println(name + " = " + i);
    }

    /* (3) */
    int squre(int x) {
        return x * x;
    }

    /* (4) */
    int roll() {
        return (int)(Math.random() * 6);
    }

    /* (5) */
    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /* (6) */
    int[] emptyArr() {
        return new int[]{};
    }
}