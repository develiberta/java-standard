/* Exercise 6-5. 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
 * [실행결과]
 * 홍길동,1,1,100,60,76,236,78.7
 */
class Exercise6_5 {
	public static void main(String args[]) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student {
	/* (1) 알맞은 코드를 넣어 완성하시오. */
	String name;
	int num;
	int ban;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	Student(String name, int num, int ban, int kor, int eng, int math) {
		
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		this.name = name;
		this.num = num;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = (int)((this.sum / 3.0f)*10+0.5)/10.0f;
	}
	
	String info() {
		return name+","+num+","+ban+","+kor+","+eng+","+math+","+sum+","+avg;
	}
}