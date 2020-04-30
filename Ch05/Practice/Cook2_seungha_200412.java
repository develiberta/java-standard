/**
 * <pre>
 * Date		: 2020. 4. 12.
 * Author 	: develiberta
 * Refer	: baekjoon, https://www.acmicpc.net/problem/2953
 * 
 * 요리 대회 우승자 구하기
 * 
 * 총 5명의 참가자가 있고, 각 참가자에게는 4개의 평가 점수가 주어집니다.
 * 위의 설명에 대응하는 5행 4열의 행렬은 문제에서 다음과 같이 주어집니다.
 * 각 행에 평가 점수1, 평가 점수2, 평가점수 3, 평가 점수4가 차례로 주어집니다.
 * 우승자 번호와 그가 얻은 점수를 출력하세요.
 * [예제 출력 예시] 4, 19
 * 
 * ## 출제의도
 * 2차원 배열을 이해합니다.
 * </pre>
 */
public class Cook2_seungha_200412 {
	
	public static void main(String[] args) {
		int[][] cook = {
				{5, 4, 4, 5},
				{5, 4, 4, 4},
				{5, 5, 4, 4},
				{5, 5, 5, 4},
				{4, 4, 4, 5}
		};
	
		/* 알맞은 코드를 넣어 완성하시오. */
		int num = 0, win = 0, sum = 0, tmp = 0;
		
		for (int[] part : cook) {
			num++;
			tmp = 0;
			for (int i : part) {
				tmp += i;
			}
			if (tmp > sum) {
				win = num;
				sum = tmp;
			}
		}
		
		System.out.printf("%d, %d%n", win, sum);		
	}
}
