/* Exercise 6-3. 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오.
 * 타입		변수명		설명
 * String	name		학생이름
 * int		ban			반
 * int		no			번호
 * int		kor			국어점수
 * int		eng			영어점수
 * int		math		수학점수
 */
/* Exercise 6-4. 문제 6-3에서 정의한 Student 클래스에
 * 다음과 같이 정의된 두 개의 메서드 getTotal()과 getAverage()를 추가하시오.
 * 1.	메서드명	:	getTotal
 *		기능		:	국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환
 *		반환타입	:	int
 *		매개변수	:	없음
 * 2.	메서드명	:	getAverage
 *		기능		:	총점(국어점수+영어점수+수학점수)을 과목 수로 나눈 평균을 구함
 *					(소수점 둘째자리에서 반올림)
 *		반환타입	:	float
 *		매개변수	:	없음
 */
class Exercise6_4 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}

class Student {
	String name;		// 학생이름
	int ban;			// 반
	int no;				// 번호
	int kor;			// 국어점수
	int eng;			// 영어점수
	int math;			// 수학점수
	
	/* (1) 알맞은 코드를 넣어 완성하시오. */
	int getTotal() {
//		int result = 0;
//		result = kor + eng + math;
//		return result;
		/* 답안이 더 간결해서 첨부 */
		return kor + eng + math;
	}
	
	float getAverage() {
//		float result = 0.0f;
//		result = (int)((getTotal()/3.0f)*10+0.5f)/10.0f;
//		return result;
		/* 답안이 더 간결해서 첨부 */
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
}