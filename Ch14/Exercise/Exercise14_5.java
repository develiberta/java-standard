import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Exercise 14-5. 문자열 배열 strArr의 모든 문자열의 길이를 더한 결과를 출력하시오.
 */
class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };
        Stream<String> strStream = Stream.of(strArr);
        int sum = strStream.collect(Collectors.summingInt(String::length));
        System.out.printf("sum = %d", sum);
    }
}