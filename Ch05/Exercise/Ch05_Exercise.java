import java.util.*;
import java.lang.Math;

/*
 * Chapter5. Array
 * Answer about Exercise
 * 2020. 04. 12
 * written by LSH
 */

class Ch05_Exercise {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.print("문제 번호(1~13)를 입력하세요.(종료:0)>");
			int num = scanner.nextInt();
			switch(num) {
				case  0: break outer;
				case  1: Exercise1(); break;
				case  2: Exercise2(); break;
				case  3: Exercise3(); break;
				case  4: Exercise4(); break;
				case  5: Exercise5(); break;
				case  6: Exercise6(); break;
				case  7: Exercise7(args); break;
				case  8: Exercise8(); break;
				case  9: Exercise9(); break;
				case 10: Exercise10(); break;
				case 11: Exercise11(); break;
				case 12: Exercise12(); break;
				case 13: Exercise13(); break;
			}
		}
	}
	
	/* Exercise 5-1. 다음은 배열을 선언하거나 초기화한 것이다.
	 * 잘못된 것을 고르고 그 이유를 설명하시오.
	 */
	private static void Exercise1() {
		System.out.println("a. int[] arr[];");						// O
		System.out.println("b. int[] arr = {1,2,3,};");				// O, 뒤의 콤마는 무시됨
		System.out.println("c. int[] arr = new int[5];");			// O
		System.out.println("d. int[] arr = new int[5]{1,2,3,4,5};");// X, 초기화를 동시에 할 땐 배열의 길이를 지정하지 않음
		System.out.println("e. int arr[5];");						// (틀림, 주의) X, 선언할 때에는 배열의 길이를 넣지 않음
		System.out.println("f. int[] arr[] = new int[3][];");		// O, 가변배열 : 마지막 차수의 길이를 지정하지 않음
	}
	
	/* Exercise 5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
	 */
	private static void Exercise2() {
		int[][] arr = {
						{ 5, 5, 5, 5, 5},
						{10, 10, 10},
						{20, 20, 20},
						{30, 30}
		};
		System.out.println(arr[3].length);		// 2 : 4번째 행의 길이가 출력되므로
	}
	
	/* Exercise 5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
	 */
	private static void Exercise3() {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
	
	/* Exercise 5-4. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
	 */
	private static void Exercise4() {
		int[][] arr = {
						{ 5, 5, 5, 5, 5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		int cnt = 0;
		for (int[] tmp : arr) {
			for (int i : tmp) {
				cnt ++;
				total += i;
			}
		}
		average = (float)total/cnt;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
	
	/* Exercise 5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
	 * (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 * [참고] Math.random()을 사용했기 때문에 실행결과가 다를 수 있다.
	 */
	private static void Exercise5() {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다.
		/* (2) */
		for (int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		
		for (int i=0; i<ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}
	
	/* Exercis 5-6. 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
	 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
	 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
	 * (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
	 */
	private static void Exercise6() {
		// 큰 금액의 동전을 우선적으로 거슬러 주어야 한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i=0; i<coinUnit.length; i++) {
			System.out.printf("%d원 : %d%n", coinUnit[i], money/coinUnit[i]);
//			money -= money/coinUnit[i]*coinUnit[i];		// money = money % coinUnit[i] 를 길게 풀어쓴 식 
			money %= coinUnit[i];
		}
	}
	
	/* Exercise 5-7. ★ 문제 5-6에 동전의 개수를 추가한 프로그램이다.
	 * 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.
	 * 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, '거스름돈이 부족합니다.'라고 출력하고 종료한다.
	 * 지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.
	 * (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 */
	private static void Exercise7(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java Exercise5_7 3120");
			System.exit(0);
		}
		
		// 문자열은 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit	= {500, 100, 50, 10};	// 동전의 단위
		int[] coin		= {5, 5, 5, 5};			// 단위별 동전의 개수
		
		for (int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			/* (1) 아래의 로직에 맞게 코드를 작성하시오.
				1. 금액(money)을 동전 단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
				2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
				   (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
				3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			*/
//			coinNum = money / coinUnit[i];		// 이 부분에서 미리 coin 배열과 비교한 값을 넣지 않아서 아래에서 복잡해짐
//												// 이후에 계속 coinNum과 coin[i] 크기 비교를 하는 소스를 보자.
//												// 미리 비교한 후 그걸 이용하는 방향으로의 필요성을 느껴야 함
//			money -= coinUnit[i] * (coin[i]>=coinNum ? coinNum : coin[i]);
//			System.out.println(coinUnit[i]+"원 : " + (coin[i]>=coinNum ? coinNum : coin[i]));
//			coin[i] -= coin[i]>=coinNum ? coinNum : coin[i];

			/* 출제의도에 맞게 다시 해결 */
			coinNum = money/coinUnit[i]<=coin[i] ? money/coinUnit[i] : coin[i];
			coin[i] -= coinNum;
			money -= coinUnit[i] * coinNum;
			System.out.println(coinUnit[i]+"원 : "+coinNum);
		}
		
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);		// 프로그램을 종료한다.
		}
		
		System.out.println("=== 남은 동전의 개수 ===");
		
		for (int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 : "+coin[i]);
		}
	}
	
	/* Exercise 5-8. 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램이다.
	 * (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
	 */
	private static void Exercise8() {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for (int i=0; i<answer.length; i++) {
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			counter[answer[i]-1]++;
		}
		
		for (int i=0; i<counter.length; i++) {
			/* (2) 알맞은 코드를 넣어 완성하시오. */
			System.out.printf("%d의 개수: %d개 > ", i+1, counter[i]);
			for (int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/* Exercise 5-9. ★ 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
	 */
	private static void Exercise9() {
		char[][] star = {
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', ' ', ' ', ' '},
							{'*', '*', '*', '*', '*'},
							{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for (int i=0; i<star.length; i++) {
			for (int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<star.length; i++) {
			for (int j=0; j<star[i].length; j++) {
				/* (1) 알맞은 코드를 넣어 완성하시오. */
				result[j][i] = star[star.length-i-1][j];
			}
		}
		
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	
	/* Exercise 5-10. 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
	 * (1)에 알맞은 코드를 넣어서 완성하시오.
	 * (표) 'a' - ` 부터 시작해서 '9' - p 까지, 소문자와 숫자를 다른 기호와 대응
	 */
	private static void Exercise10() {
		char[] abcCode = {
							'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
							'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
							'}', ';', ':', ',', '.', '/'
		};
		char[] numCode = {
							'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'
		};
		
		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			if ('a'<=ch && ch<='z') result += abcCode[ch-'a'];
			else if ('0'<=ch && ch<='9') result += numCode[ch-'0'];
		}
		
		System.out.println("src : " + src);
		System.out.println("result : " + result);
		
	}
	
	/* Exercise 5-11. 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
	 * 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
	 * (1)에 알맞은 코드를 넣어서 완성하시오.
	 */
	private static void Exercise11() {
		int[][] score = {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
			/* (1) 알맞은 코드를 넣어 완성하시오. */
				result[i][j] = score[i][j];
				result[i][result[i].length-1] += score[i][j];
				result[result.length-1][j] += score[i][j];
			}
			result[result.length-1][result[i].length-1] += result[i][result[i].length-1];
		}
		
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
	
	/* Exercise 5-12. 예제 5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
	 */
	private static void Exercise12() {
		String[][] words = {
			{"chair", "의자"},
			{"computer", "컴퓨터"},
			{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		
		for (int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if (tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				cnt++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, cnt);
	}
	
	/* Exercise 5-13. 단어의 글자 위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
	 * 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.
	 */
	private static void Exercise13() {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scanner = new Scanner(System.in);
		char tmp = ' ';
		
		for (int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();	// String을 char[]로 변환
			
			/* (1) 알맞은 코드를 넣어 완성하시오.
				   char 배열 question에 담긴 문자의 위치를 임의로 바꾼다. */
			for (int j=0; j<question.length; j++) {
				int index = (int)(Math.random() * question.length);
				tmp = question[j];
				question[j] = question[index];
				question[index] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.> ", i+1, new String(question));
			String answer = scanner.nextLine();
			
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}
	
}