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
		System.out.println();
		
		/* 모범답안 */
        Stream<String> strStream2 = Stream.of(strArr);
//		sum = strStream2.mapToInt(s -> s.length()).sum();
		sum = strStream2.mapToInt(String::length).sum();
		System.out.println("sum = " + sum);
		
		/* 또다른 방법 */
		Stream<String> strStream3 = Stream.of(strArr);
		Stream<Integer> integerStream = strStream3.map(s -> s.length());
		sum = integerStream.reduce(0, (a, b) -> Integer.sum(a, b));
		System.out.println("sum = " + sum);
    }
}