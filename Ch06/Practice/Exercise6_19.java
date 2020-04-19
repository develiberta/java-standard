/* Exercise 6-19. 다음 코드의 실행 결과를 예측하여 적으시오.
 */
class Exercise6_19 {
	public static void change(String str) {
		str += "456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change : " + str);
	}
}
/*
 * [실행 결과 예측] ABC123
 * change(String str) 메서드의 변수 str은 지역변수이지만 참조변수
 * 참조변수는 객체의 주소를 넘기므로 객체에 대한 read-write 가능
 * String은 다른 객체들과는 조금 다른 특성을 가지고 있어서 write 불가능
 * str += ... 는 새로운 String 객체를 만듦
 * 이렇게 새로운 객체를 만들어서 "456"을 추가했지만 지역변수이므로 메서드 소멸 시 변수도 소멸됨
 * 추가한 값을 반환하지 않았고, 그 String 객체는 더이상 참조할 수 없는 객체가 됨
 * println 한 str 객체는 변함없이 "ABC123"
 */