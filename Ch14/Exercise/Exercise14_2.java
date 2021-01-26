import java.util.Arrays;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.IntStream;

/* Exercise 14-2. 람다식을 메서드 참조로 변환하여 표를 완성하시오.
 * (변환이 불가능한 경우 '변환 불가'라고 적어야 함)
 */
class Exercise14_2 {
    public static void main(String[] args) {

        /* (1) */
        Function<String, Integer> func1_1 = (String s) -> s.length();
        Function<String, Integer> func1_2 = String::length;

        /* (2) */
        Supplier<int[]> func2_1 = () -> new int[]{};
        Function<Integer, int[]> func2_2 = int[]::new;

        /* (3) */
        Function<int[], IntStream> func3_1 = arr -> Arrays.stream(arr);
        Function<int[], IntStream> func3_2 = Arrays::stream;

        /* (4) */
        BiPredicate<String, String> func4_1 = (String str1, String str2) -> str1.equals(str2);
        BiPredicate<String, String> func4_2 = String::equals;

        /* (5) */
        BinaryOperator<Integer> func5_1 = (a, b) -> Integer.compare(a,b);
        BinaryOperator<Integer> func5_2 = Integer::compare;

        /* (6) */
        BiFunction<String, Integer, Card> func6_1 = (String kind, Integer num) -> new Card(kind, num);
        BiFunction<String, Integer, Card> func6_2 = Card::new;

        /* (7) */
        Consumer<Object> func7_1 = (x) -> System.out.println(x);
        Consumer<Object> func7_2 = System.out::println;

        /* (8) */
        DoubleSupplier func8_1 = () -> Math.random();
        DoubleSupplier func8_2 = Math::random;

        /* (9) */
        UnaryOperator<String> func9_1 = (str) -> str.toUpperCase();
        UnaryOperator<String> func9_2 = String::toUpperCase;

        /* (10) */
        Supplier<Exception> func10_1 = () -> new NullPointerException();
        Supplier<Exception> func10_2 = NullPointerException::new;

        /* (11) */
        Function<Optional, Object> func11_1 = (Optional opt) -> opt.get();
        Function<Optional, Object> func11_2 = Optional::get;

        /* (12) */
        BiFunction<StringBuffer, String, StringBuffer> func12_1 = (StringBuffer sb, String s) -> sb.append(s);
        BiFunction<StringBuffer, String, StringBuffer> func12_2 = StringBuffer::append;

        /* (13) */
        Consumer<String> func13_1 = (String s) -> System.out.println(s);
        Consumer<String> func13_2 = System.out::println;

    }

}

class Card {
    String kind;
    int num;

    Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }
}