import java.util.*;
import java.lang.Math;

/*
 * Chapter3. Operator
 * Answer about Exercise
 * 2020. 04. 03
 * written by LSH
 */

class Ch03_Exercise {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.print("문제 번호(1~10)를 입력하세요.(종료:0)>");
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
			}
		}
	}
	
	/* Exercise 3-1. 다음 연산의 결과를 적으시오 */
	private static void Exercise1() {
		int x = 2;
		int y = 5;
		char c = 'A';	// 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);			// 1+x=1+2=3, 3은 2진수로 11
													// 33=32*1+1 에서 왼쪽 시프트 1만큼 처리
													// 1*2^2 + 1*2^1 = 6
		System.out.println(y>=5 || x<0 && x>2);		// true || false 에서, true
		System.out.println(y += 10 - x++);			// 10에서 2(이후 1 더함)를 뺀 후 y 값인 5에 더하므로 13 
		System.out.println(x += 2);					// 위에서 x는 1이 더해진 상태이므로 3+2 = 5
		System.out.println(!('A'<=c && c<='Z'));	// !(true)이므로 false
		System.out.println('C'-c);					// 2
		System.out.println('5'-'0');				// 5
		System.out.println(c+1);					// 66 int형 출력
		System.out.println(++c);					// 67 char형 출력 : 'B'
		System.out.println(c++);					// 67 char형 출력되고 그 후에 1 더해짐 : 'B'
		System.out.println(c);						// 68 char형 출력 : 'C'
	}
	
	/* Exercise 3-2. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
	 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
	 * (1)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise2() {
		int numOfApples = 121;	// 사과의 개수
		int sizeOfBucket = 10;	// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket1 = /* (1) */ (numOfApples + (sizeOfBucket-1)) / sizeOfBucket; // 모든 사과를 담는 데 필요한 바구니의 개수
		int numOfBucket2 = /* (1) */ numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket==0?0:1);
		System.out.println("필요한 바구니의 수1 : " + numOfBucket1);
		System.out.println("필요한 바구니의 수2 : " + numOfBucket2);
	}
	
	/* Exercise 3-3. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
	 * 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
	 * [Hint] 삼항 연산자를 두 번 사용하기
	 */
	private static void Exercise3() {
		int num = 10;
		System.out.println(/* (1) */ num>0 ? "양수" : (num<0 ? "음수" : "0"));
	}
	
	/* Exercise 3-4. 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
	 * 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
	 * (1)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise4() {
			int num = 456;
			System.out.println(/* (1) */ (num/100)*100);
	}
	
	/* Exercise 3-5. 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다.
	 * 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다.
	 * (1)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise5() {
		int num = 333;
		System.out.println(/* (1) */ (num/10)*10 + 1);
	}
	
	/* Exercis 3-6. 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
	 * 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다.
	 * 30에서 24를 뺀 나머지가 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
	 * (1)에 알맞은 코드를 넣으시오.
	 * [Hint] 나머지 연산자를 사용하라.
	 */
	private static void Exercise6() {
		int num = 24;
		System.out.println(/* (1) */ ((num/10)*10 + 10) - num);
		System.out.println(/* (1) */ 10 - num%10);
	}
	
	/* Exercise 3-7. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
	 * 변환 공식이 'C = 5/9 * (F-32)' 라고 할 때, (1)에 알맞은 코드를 넣으시오.
	 * 단, 변환 결과값은 소수점 셋째자리에서 반올림 해야 한다.
	 * (Math.round()를 사용하지 않고 처리할 것)
	 */
	private static void Exercise7() {
		int fahrenheit = 100;
		float celcius = /* (1) */ (int)(((fahrenheit-32f)*5/9)*100+0.5)/100f;
		
		System.out.println("Farenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
	
	/* Exercise 3-8. 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
	 * [실행결과]
	 * c=30
	 * ch=C
	 * f=1.5
	 * l=27000000000
	 * result=true
	 */
	private static void Exercise8() {
		byte a = 10;
		byte b = 20;
		//byte c = a + b;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		//ch = ch + 2;
		ch = (char)(ch + 2);
		
		//float f = 3 / 2;
		float f = 3 / 2f;
		//long l = 3000 * 3000 * 3000;
		long l = 3000 * 3000 * 3000l;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		//boolean result = d==f2;
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
	
	/* Exercise 3-9. 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.
	 * (1)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise9() {
		char ch = 'z';
		boolean b = /* (1) */ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' || ch>='0'&&ch<='9';
		
		System.out.println(b);
	}
	
	/* Exercise 3-10. 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
	 * 문자코드는 소문자가 대문자보다 32만큼 더 크다.
	 * 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다.
	 * (1)~(2)에 알맞은 코드를 넣으시오.
	 */
	private static void Exercise10() {
		char ch = 'A';
		
		char lowerCase = (/* (1) */ ch>='A'&&ch<='Z') ? (/* (2) */ (char)(ch+32) ) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}