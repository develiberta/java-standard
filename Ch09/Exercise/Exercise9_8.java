/* Exercise 9-8. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *
 * 메서드명	: round
 * 기능		: 주어진 값을 반올림하여, 소수점이하 n자리의 값을 반환한다.
			  예를 들어 n의 값이 3이면, 소수점4째 자리에서 반올림하여 소수점이하 3자리 수를 반환한다.
 * 반환타입	: double
 * 매개변수	: double d	- 변환할 값
 *			  int n		- 반올림한 결과의 소수점 자리
 *
 * [Hint] Math.round()와 Math.pow()을 이용하라.
 */
class Exercise9_8 {
	/* (1) round메서드를 작성하시오. */
	static double round(double d, int n) {
		return Math.round(d*Math.pow(10,n))/Math.pow(10,n);
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}