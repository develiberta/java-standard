/* Exercise 7-29. 지역클래스에서 외부클래스의 인스턴스멤버와 static멤버에 모두 접근할 수 있지만,
 * 지역변수는 final이 붙은 상수만 접근할 수 있는 이유는 무엇인가?
 *
 * [답]
 * (i)	메서드가 static인 경우
 *		지역클래스에서 외부클래스의 static멤버에 접근 가능
 *		지역클래스에서 외부클래스의 instance멤버에 접근 불가능 (만들어지지 않았을 수도 있으므로)
 *		(Ch07/Example/InnerEx3.java 참고)
 *
 * (ii)	메서드가 static이 아닌 경우
 *		지역클래스에서 외부클래스의 static멤버에 접근 가능
 *		지역클래스에서 외부클래스의 static멤버에 접근 가능
 *
 * (공통)
 * 지역클래스에서 지역변수는 final이 붙은 상수만 접근 가능
 * (JDK 1.8부터는 final이 안붙은 지역변수에 자동으로 final을 추가하며, 참조되는 지역변수를 변경하고자 하면 컴파일 에러 발생)
 * 지역클래스의 인스턴스가 생성돼서 Heap영역에 존재한다고 하자. (모든 인스턴스는 Heap영역에 생성)
 * 메서드 내의 변수는 Call Stack영역에 존재하다가 메서드가 수행을 마치면 메서드와 함께 소멸된다.
 * 그러면 Heap영역에 존재하는 지역클래스의 인스턴스는 소멸된 변수를 참조/대입하게 된다.
 * 한편, 메서드 내의 변수를 final 즉, 상수로 지정한다고 생각해보자.
 * 상수는 메서드 내에 존재하더라도 Method Area의 로드된 클래스 내 상수풀(Constant Pool)에 저장된다.
 * 이는 메서드가 수행을 마치고 Call Stack영역에서 소멸되더라도 Method Area에 여전히 남아있다.
 * 그러므로 지역클래스의 인스턴스는 이를 참조/대입 가능한 것이다.
 *
 * [해설]
 * 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도,
 * 지역클래스의 인스턴스가 소멸된 지역변수를 참조하려는 경우가 발생할 수 있기 때문이다.
 * 아직 스레드를 배우지 않았지만, 스레드를 이용해서 아래의 상황을 만들어보았다.
 * 실행결과를 보면 main메서드가 종료된 후에도 지역변수 VALUE의 값을 사용하고 있다는 것을 알 수 있다.
 * 지역변수는 메서드가 종료되면 함께 사라지지만,
 * 상수의 경우 컨스턴트 풀(Constant Pool, 상수를 따로 모아서 저장해놓은 곳)에 저장되어 있기 때문에
 * 사용할 수 있는 것이다.
 */
import java.awt.*;
import java.awt.event.*;

class Exercise7_29 {
	public static void main(String[] args) {
		final int VALUE = 10;					// 외부클래스의 지역변수
		
		Thread t = new Thread(new Runnable() {	// 익명클래스 (내부클래스)
			public void run() {
				for(int i=0; i<10; i++) {		// 10번 반복
					try {
						Thread.sleep(1*1000);	// 1초간 멈춤
					} catch(InterruptedException e) {}
					
					System.out.println(VALUE);	// 외부클래스의 지역변수 사용
				}
			}	// run()
		});
		
		t.start();	// 스레드를 시작
		System.out.println("main() - 종료");
	}	// main
}