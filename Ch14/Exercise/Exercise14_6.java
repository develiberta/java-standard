import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Exercise 14-6. 문자열 배열 strArr의 문자열 중에서 가장 긴 것의 길이를 출력하시오.
 */
class Exercise14_6 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bb", "c", "dddd" };
        Stream<String> strStream1 = Stream.of(strArr);
        Stream<String> strStream2 = Stream.of(strArr);

        String stringMax = strStream1.collect(
                                        Collectors.collectingAndThen(
                                                Collectors.maxBy(
                                                        Comparator.comparingInt(String::length)
                                                ), Optional::get
                                        )
                            );

        /* stringMax 의 길이를 그냥 가져와도 되지만 연습을 위해 다음과 같이 작성 */
        int lengthMax = strStream2.collect(
                Collectors.collectingAndThen(
                    Collectors.collectingAndThen(
                            Collectors.maxBy(
                                    Comparator.comparingInt(String::length)
                            ), Optional::get
                    ), String::length
                )
        );
        System.out.printf("%s : %d", stringMax, lengthMax);
    }
}