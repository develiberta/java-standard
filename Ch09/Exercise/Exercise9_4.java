/* Exercise 9-4. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * ★ 이 문제가 출제된 이유?
 * 메서드명	: printGraph
 * 기능		: 주어진 배열에 담긴 값만큼 주어진 문자를 가로로 출력한 후, 값을 출력한다.
 * 반환타입	: 없음
 * 매개변수	: int[] dataArr	- 출력할 그래프의 데이터
 *			  char ch		- 그래프로 출력할 문자
 */
class Exercise9_4 {
	static void printGraph(int[] dataArr, char ch) {
		/* (1) printGraph메서드를 작성하시오. */
		for(int i=0; i<dataArr.length; i++) {
			for(int j=0; j<dataArr[i]; j++)
				System.out.print(ch);
			System.out.println(dataArr[i]);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4}, '*');
	}
}