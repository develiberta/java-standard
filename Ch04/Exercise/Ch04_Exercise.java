import java.util.*;
import java.lang.Math;

/*
 * Chapter4. Control Logic
 * Answer about Exercise
 * 2020. 04. 04
 * written by LSH
 */

class Ch04_Exercise {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.print("문제 번호(1~15)를 입력하세요.(종료:0)>");
			int num = scanner.nextInt();
			switch(num) {
				case  0: break outer;
				case  1: Exercise1(); break;
				case  2: Exercise2(); break;
				case  3: Exercise3(); break;
				case  4: Exercise4(); break;
				case  5: Exercise5(); break;
				case  6: Exercise6(); break;
				case  7: Exercise7(); break;
				case  8: Exercise8(); break;
				case  9: Exercise9(); break;
				case 10: Exercise10(); break;
				case 11: Exercise11(); break;
				case 12: Exercise12(); break;
				case 13: Exercise13(); break;
				case 14: Exercise14(); break;
				case 15: Exercise15(); break;
			}
		}
	}
	
	/* Exercise 4-1. 다음의 문장들을 조건식으로 표현하라. */
	private static void Exercise1() {
		System.out.println("if (x>10 && x<20)");	// int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		System.out.println("ch!=(' ' || '\\t')");	// char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		System.out.println("!(ch==' ' || ch=='\\t')");
		System.out.println("ch=='x' || ch=='X'");	// char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		System.out.println("ch>='0' && ch<='9'");	// char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		System.out.println("ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'");	// char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		System.out.println("year%400==0 || year%4==0 && year%100!=0");	// int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을 때 true인 조건식
		System.out.println("!powerOn");				// boolean형 변수 powerOn가 false일 때 true인 조건식
		System.out.println("str.equals(\"yes\")");	// 문자열 참조변수 str이 "yes"일 때 true인 조건식
	}
	
	/* Exercise 4-2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	 */
	private static void Exercise2() {
		int sum = 0;
		for (int i=1; i<=20; i++) {
			if (i%2==0 || i%3==0) continue;
			System.out.println("더해지는 값 : " + i);
			sum += i;
		}
		System.out.println("1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합은 "+sum+"입니다.");
	}
	
	/* Exercise 4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	 */
	private static void Exercise3() {
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			System.out.print("더해지는 값 : ");
//			for (int j=1; j<=i; j++) {
//				if (j!=1) System.out.print("+");
//				System.out.print(j);
//				sum += j;
//			}
//			System.out.println();
//		}
//		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과는 "+sum+"입니다.");
	
		/* 해설지의 답안이 더 좋아서 첨부 */
		int sum = 0;
		int totalSum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
			totalSum += sum;
		}
		System.out.println("totalSum = " + totalSum);
	}
	
	/* Exercise 4-4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해 나갔을 때,
	 * 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
	 */
	private static void Exercise4() {
//		int num = 1;
//		int sum = 0;
//		while (sum<100) {
//			if (num!=1) System.out.print("+");
//			System.out.print("("+num+")");
//			sum += num;
//			num = num>0? -(num+1):-(num-1);
//		}
//		System.out.println();
//		System.out.println("sum = " + sum);

		/* 해설지의 답안이 더 좋아서 첨부 */
		int sum = 0;	// 총합을 저장할 변수
		int s = 1;		// 값의 부호를 바꿔주는데 사용할 변수
		int num = 0;
		
		// 조건식의 값이 true이므로 무한반복문
		for (int i=1; sum<100; i++, s=-s) {
			num = s * i;
			sum += num;
//			if (sum>=100) break;
		}
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}
	
	/* Exercise 4-5. 다음의 for문을 while문으로 변경하시오.
	 */
	private static void Exercise5() {
		System.out.println("[문제]");
		for (int i=0; i<=10; i++) {
			for (int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("[풀이]");
		int i = 0, j = 0;
		while (i<=10) {
			j = 0;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
	
	/* Exercis 4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
	 */
	private static void Exercise6() {
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
			if (i+j==6) System.out.print("["+i+","+j+"] ");
			}
		}
		System.out.println();
	}
	
	/* Exercise 4-7. Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
	 * (1)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise7() {
		int value = /* (1) */ (int)(Math.random()*6) + 1;
		System.out.println("value : " + value);
	}
	
	/* Exercise 4-8. 방정식 2x + 4y = 10 의 모든 해를 구하시오.
	 * 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
	 */
	private static void Exercise8() {
		for (int x=0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				if (2*x + 4*y == 10)
					System.out.printf("x=%d, y=%d%n", x, y);
			}
		}
	}
	
	/* Exercise 4-9. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	 * 만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15를 출력해야 한다.
	 * (1)에 알맞은 코드를 넣으시오.
	 * [Hint] String 클래스의 charAt(int i)을 사용
	 */
	private static void Exercise9() {
		String str = "12345";
		int sum = 0;
		
		for (int i=0; i<str.length(); i++) {
			/* (1) */
			sum += (int)(str.charAt(i) - '0');	// 해설지를 보니, 여기에서 (int)는 필요하지 않았음
		}
		System.out.println("sum = " + sum);
	}
	
	/* Exercise 4-10. int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	 * 만일 변수 num의 값이 12345 라면, '1+2+3+4+5'의 결과인 15를 출력해야 한다.
	 * (1)에 알맞은 코드를 넣으시오.
	 * [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	 */
	private static void Exercise10() {
		int num = 12345;
		int sum = 0;
		/* (1) */
		while (num!=0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("sum = " + sum);
		
	}
	
	/* Exercise 4-11. 피보나치(Fibonnaci) 수열은 앞의 두 수를 더해서 다음 수를 만들어나가는 수열이다.
	 * 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서
	 * 1, 1, 2, 3, 5, 8, 13, 21, ... 과 같은 식으로 진행된다.
	 * 1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
	 */
	private static void Exercise11() {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;	// 세번째 값
		System.out.print(num1+","+num2);
		
		for (int i=0; i<8; i++) {
			/* (1) */
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(","+num3);
		}
		System.out.println();
		System.out.println("1,1부터 시작하는 피보나치 수열의 10번째 수는 "+num3+"입니다.");
	}
	
	/* Exercise 4-12. 구구단의 일부분을 다음과 같이 출력하시오.
	 * 3개 단 이후 줄바꿈, 한 줄 공백, 각 *3까지만
	 */
	private static void Exercise12() {
//		for (int i=2; i<=8; i=i+3) {
//			for (int j=1; j<=3; j++) {
//				System.out.printf("%d*%d=%d\t", i, j, i*j);
//				System.out.printf("%d*%d=%d\t", i+1, j, i*j);
//				if (i+2<10) System.out.printf("%d*%d=%d", i+2, j, i*j);
//				System.out.println();
//			}
//			System.out.println();
//		}

		/* 해설지의 답안이 더 좋아서X 신기해서O 첨부 */
		for (int i=1; i<=9; i++) {
			int y = i%3==0? 3 : i%3;
			for (int j=1; j<=3; j++) {
				int x = (j+1)+(i-1)/3*3;
//				int y = i%3==0? 3 : i%3;
				
				if (x>9) break;	// 9단까지만 출력. 이 코드가 없으면 10단까지 출력.
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
//			if (i%3==0) System.out.println();
			if (y==3) System.out.println();
		}
	}
	
	/* Exercise 4-13. 다음은 주어진 문자열(value)이 숫자인지 판별하는 프로그램이다.
	 * (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 */
	private static void Exercise13() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for (int i=0; i<value.length(); i++) {
			/* (1) */
			if (value.charAt(i)<'0' || value.charAt(i)>'9') {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber)	System.out.println(value+"는 숫자입니다.");
		else			System.out.println(value+"는 숫자가 아닙니다.");
	}
	
	/* Exercise 4-14. 다음은 숫자맞추기 게임을 작성한 것이다.
	 * 1과 100 사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
	 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
	 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
	 * (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
	 */
	private static void Exercise14() {
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = /* (1) */ (int)(Math.random()*100) + 1;
		int input = 0;		// 사용자 입력을 저장할 공간
		int count = 0;		// 시도 횟수를 세기 위한 변수
		
		// 화면으로부터 사용자 입력을 받기 위해서 Scanner 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			input = s.nextInt();	// 입력받은 값을 변수 input에 저장
			
			/* (2) */
			if (input<answer) System.out.println("더 큰 수를 입력하세요.");
			else if (input>answer) System.out.println("더 작은 수를 입력하세요.");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 "+count+"번입니다.");
				break;
			}
		} while(true);	// 무한반복문
	}
	
	/* Exercise 4-15. 다음은 회문수를 구하는 프로그램이다.
	 * 회문수(palindrome)란, 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
	 * 예를 들면 '12321'이나 '13531' 같은 수를 말한다.
	 * (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	 * [Hint] 나머지 연산자를 이용하시오.
	 */
	private static void Exercise15() {
		int number = 12321;
		int tmp = number;
		
		int result = 0;		// 변수 number를 거꾸로 변환해서 담을 변수
		
		while (tmp!=0) {
			/* (1) */
			result = result*10;
			result += tmp%10;
			tmp = tmp/10;
		}
		
		if (number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");
	}
}