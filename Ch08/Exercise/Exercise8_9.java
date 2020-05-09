/* Exercise 8-9. 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
 * [참고] 생성자는 실행결과를 보고 알맞게 작성해야 한다.
 *
 * 클래스명	: UnsupportedFunctionException
 * 조상클래스명	: RuntimeException
 * 멤버변수	:
 *				이름			: ERR_CODE
 *				저장값		: 에러코드
 *				타입			: int
 *				기본값		: 100
 *				제어자		: final private
 * 메서드		:
 *				1.	메서드명	: getErrCode
 *					기능		: 에러코드(ERR_CODE)를 반환
 *					반환타입	: int
 *					매개변수	: 없음
 *					제어자	: public
 *				2.	메서드명	: getMessage
 *					기능		: 메세지의 내용을 반환한다. (Exception클래스의 getMessage()를 오버라이딩)
 *					반환타입	: String
 *					매개변수	: 없음
 *					제어자	: public
 *
 * [실행결과]
 * Exception in thread "main" UnsupportedFunctionException: [100] 지원하지 않는 기능입니다.
 *		at Exercise8_9.main(Exercise8_9.java:5)
 */
class Exercise8_9 {
	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	
	final private int ERR_CODE;		// 에러코드 저장
	
	UnsupportedFunctionException(String errMsg, int errCode) {
		super(errMsg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFunctionException(String errMsg) {
		this(errMsg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode()+"] " + super.getMessage();
	}
	
}