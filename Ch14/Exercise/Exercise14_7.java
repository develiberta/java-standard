import java.util.Random;
import java.util.stream.IntStream;

/* Exercise 14-7. 임의의 로또번호(1~45)를 정렬해서 출력하시오.
 */
class Exercise14_7 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1, 46);
        intStream.distinct().limit(6).sorted().forEach(System.out::println);
    }
}