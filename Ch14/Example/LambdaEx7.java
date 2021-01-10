import java.util.function.*;

class LambdaEx7 {
	public static void main(String[] args) {
		Function<String, Integer>	f1		= (s) -> Integer.parseInt(s, 16);
		Function<Integer, String>	g1		= (i) -> Integer.toBinaryString(i);
		
		Function<String, String>	h1		= f1.andThen(g1);
		Function<Integer, Integer>	h2		= f1.compose(g1);
		
		System.out.println(h1.apply("FF"));					// "FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2));					// 2 -> "10" -> 16
		
		
		Function<String, String>	f2		= x -> x;		// 항등 함수 (identity function)
		System.out.println(f2.apply("AAA"));				// "AAA"가 그대로 출력됨
		
		Predicate<Integer>			p1		= i -> i < 100;
		Predicate<Integer>			q1		= i -> i < 200;
		Predicate<Integer>			r1		= i -> i % 2 == 0;
		Predicate<Integer>			notP1	= p1.negate();	// i >= 100
		
		Predicate<Integer>		  all		= notP1.and(q1.or(r1));
		System.out.println(all.test(150));					// true
		
		String str1	= "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String>			p2		= Predicate.isEqual(str1);
		
		boolean result = p2.test(str2);
		System.out.println(result);
	}
}