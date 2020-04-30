import java.util.Scanner;

public class Grade_OOP_seungha_200426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		int cnt = scanner.nextInt();
		
		Student[] studentArr = new Student[cnt];
		
		/* 입력한 학년에 따른 자손 클래스의 인스턴스 생성 : 다형성 */
		switch(grade) {
			case 1:
				studentArr = new Student1[cnt];
				break;
			case 2:
				studentArr = new Student2[cnt];
				break;
			case 3:
				studentArr = new Student3[cnt];
				break;
		}
		
		for (int i=0; i<cnt; i++) {
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int mat = scanner.nextInt();
			switch(grade) {
				case 1:
					int phy = scanner.nextInt();
					int art = scanner.nextInt();
					studentArr[i] = new Student1(name, kor, eng, mat, phy, art);
					break;
				case 2:
					int sci = scanner.nextInt();
					int his = scanner.nextInt();
					studentArr[i] = new Student2(name, kor, eng, mat, sci, his);
					break;
				case 3:
					int jin = scanner.nextInt();
					studentArr[i] = new Student3(name, kor, eng, mat, jin);
					break;
			}
		}
		
		/* sort의 매개변수로 조상 클래스를 받을 수 있으므로 그 자손 클래스는 모두 받을 수 있음 : 다형성 */
		studentArr = Report.getInstance().sort(studentArr);	// 첫 문제에서 구현한 메서드 그대로 이용
		
		for (int i=0; i<cnt; i++) {
			System.out.println(studentArr[i].getName());
		}
		
		scanner.close();
	}

}

/*********************************************************************************************/

/* Student를 상속받은 1학년 Student */
class Student1 extends Student {
	private int phy;
	private int art;
	
	Student1(String name, int kor, int eng, int mat, int phy, int art) {
		super(name, kor, eng, mat);
		this.phy = phy;
		this.art = art;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getArt() {
		return art;
	}
	public void setArt(int art) {
		this.art = art;
	}
}

/* Student를 상속받은 2학년 Student */
class Student2 extends Student {
	private int sci;
	private int his;
	
	Student2(String name, int kor, int eng, int mat, int sci, int his) {
		super(name, kor, eng, mat);
		this.sci = sci;
		this.his = his;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}
}

/* Student를 상속받은 3학년 Student */
class Student3 extends Student {
	private int jin;
	
	Student3(String name, int kor, int eng, int mat, int jin) {
		super(name, kor, eng, mat);
		this.jin = jin;
	}
	public int getJin() {
		return jin;
	}
	public void setJin(int jin) {
		this.jin = jin;
	}
}