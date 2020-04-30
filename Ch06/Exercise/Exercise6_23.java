/* Exercise 6-23. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명	:	max
 * 기능		:	주어진 itn형 배열의 값 중에서 제일 큰 값을 반환
 *				만일 주어진 배열이 null 이거나 크기가 0 인 경우, -999999 를 반환
 * 반환타입	:	int
 * 매개변수	:	int[] arr (최대값을 구할 배열)
 */
class Exercise6_23 {
	/* (1) max 메서드를 작성하시오. */
	static int max(int[] data) {
		if (data==null || data.length==0) return -999999;
		int max = data[0];
		for (int i=1; i<data.length; i++)
			if (data[i]>max)	max = data[i];
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[]{}));	// 크기가 0인 배열
	}
}