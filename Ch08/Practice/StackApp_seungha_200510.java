import java.util.Scanner;

/** [날짜] 2020-05-10
 *  [참고] 명품 JAVA Programming 인터페이스 단원 문제 변형
 *  [문제]
 *  1. 주어진 Stack 인터페이스를 상속받아 문자열을 Stack 자료구조로 저장하는 StringStack 클래스를 구현하시오.
 *  2. 다음 실행결과를 출력하도록 StackApp 클래스에 main() 메서드를 작성하시오.
 *  [실행결과]
 *  총 스택 저장 공간의 크기 입력 >> 3
 *  문자열 입력 (종료는 0) >> hello
 *  문자열 입력 (종료는 0) >> world
 *  문자열 입력 (종료는 0) >> java
 *  문자열 입력 (종료는 0) >> try
 *  Stack이 가득 차서 넣을 수 없습니다.
 *  문자열 입력 (종료는 0) >> 0
 *  스택에 저장된 모든 문자열 출력 : java world hello
 *  [조건]
 *  IndexOutOfBoundsException 예외를 처리하는 try-catch문을 포함하시오.
 */
interface Stack_seungha {
	int length();							// Stack에 저장된 항목의 개수 반환
	int capacity();						// Stack에 저장 가능한 항목의 개수 반환
	String pop();							// Stack에서 항목을 꺼내고 이를 반환
	boolean push(String str);		// Stack에 항목을 저장하고 성공적으로 저장하면 true를, 실패하면 false를 반환
}

/* [문제] 1. 주어진 Stack 인터페이스를 상속받아 문자열을 Stack 자료구조로 저장하는 StringStack 클래스를 구현하시오. */
class StringStack_seungha implements Stack_seungha {

	String[] strArr;		// String 배열
	int cnt = 0;			// 배열에 들어있는 항목의 개수
	
	StringStack_seungha(int size) {
		strArr = new String[size];
	}
	
	StringStack_seungha() {
		this(0);
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return cnt;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return strArr.length-cnt;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return strArr[--cnt];
	}

	@Override
	public boolean push(String str) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			strArr[cnt++] = str;
			return result=true;
		} catch(IndexOutOfBoundsException e) {							// [조건] IndexOutOfBoundsException 예외를 처리하는 try-catch문을 포함하시오.
			System.out.println("Stack이 가득 차서 넣을 수 없습니다.");
			cnt--;
			return result;
		} catch(Exception e) {
			System.out.println("Stack에 값을 넣을 수 없습니다.");
			cnt--;
			return result;
		}
	}
	
	public String toString() {
		String summary = "";

		while(cnt!=0) {
			summary += pop() + " ";
		}
		return summary;
	}
	
}

/* [문제] 2. 다음 실행결과를 출력하도록 StackApp 클래스에 main() 메서드를 작성하시오.
 * [실행결과]
 *  총 스택 저장 공간의 크기 입력 >> 3
 *  문자열 입력 (종료는 0) >> hello
 *  문자열 입력 (종료는 0) >> world
 *  문자열 입력 (종료는 0) >> java
 *  문자열 입력 (종료는 0) >> try
 *  Stack이 가득 차서 넣을 수 없습니다.
 *  문자열 입력 (종료는 0) >> 0
 *  스택에 저장된 모든 문자열 출력 : java world hello
 */
class StackApp_seungha_200510 {
	public static void main(String[] args) {

		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		StringStack_seungha stack = new StringStack_seungha(size);
		
		while(true) {
			System.out.print("문자열 입력 (종료는 0) >> ");
			String input = scanner.next();
			if(input.equals("0")) {
				System.out.print("스택에 저장된 모든 문자열 출력 : ");
				System.out.print(stack);
				break;
			}
			stack.push(input);
		}

		scanner.close();
	}
}