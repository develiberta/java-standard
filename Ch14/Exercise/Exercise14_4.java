import java.util.*;
import java.util.stream.*;

/* Exercise 14-4. 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
 * [Hint] 배열을 사용하시오.
 *
 * [실행결과]
 * [1, 5]
 * [2, 4]
 * [3, 3]
 * [4, 2]
 * [5, 1]
 */
class Exercise14_4 {
	public static void main(String[] args) {
        Integer[] dice = { 1, 2, 3, 4, 5, 6 };
        Stream<Integer> stream = Stream.of(dice);

        stream.forEach(i -> {
            for (int j : dice) {
                if (6 - i == j) {
                    System.out.printf("[%d, %d]%n", i, j);
                }
            }
        });
		
		System.out.println();
		
		/* 모범답안 */
		Stream<Integer> stream2 = IntStream.rangeClosed(1, 6).boxed();
		
		stream2.flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[]{i, i2}))
			   .filter(iArr -> iArr[0] + iArr[1] == 6)
			   .forEach(iArr -> System.out.println(Arrays.toString(iArr)));
    }
}