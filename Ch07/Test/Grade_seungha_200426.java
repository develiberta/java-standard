import java.util.Scanner;

public class Grade_seungha_200426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int cnt = scanner.nextInt();
		Student[] studentArr = new Student[cnt];
		
		for (int i=0; i<cnt; i++) {
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int mat = scanner.nextInt();
			studentArr[i] = new Student(name, kor, eng, mat);
		}
		
		studentArr = Report.getInstance().sort(studentArr);
		
		for (int i=0; i<cnt; i++) {
			System.out.println(studentArr[i].getName());
		}
		
		scanner.close();
	}
}
	
class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}

/* 성적을 정렬하는 용도로 만든 singleton class */
class Report {
	
	private static Report report = new Report();
	
	private Report() {}
	
	/* singleton pattern */
	static Report getInstance() {
		if (report==null) report = new Report();
		return report;
	}
	
	/* 정렬 메서드 */
	Student[] sort(Student[] studentArr) {
		/* 국어 점수 내림차순, 버블 정렬 */
		for (int i=studentArr.length-1; i>0; i--) {
			for (int j=studentArr.length-1; j>studentArr.length-1-i; j--) {
				if (studentArr[j].getKor()>studentArr[j-1].getKor()) {
					Student tmp = studentArr[j];
					studentArr[j] = studentArr[j-1];
					studentArr[j-1] = tmp;
				}
			}
		}
		
		/* 영어 점수 오름차순, 버블 정렬 */
		for (int i=0; i<studentArr.length-1; i++) {
			for (int j=0; j<studentArr.length-1-i; j++) {
				if (studentArr[j].getKor()==studentArr[j+1].getKor()) {
					if (studentArr[j].getEng()>studentArr[j+1].getEng()) {
						Student tmp = studentArr[j];
						studentArr[j] = studentArr[j+1];
						studentArr[j+1] = tmp;
					}
				}
			}
		}
		
		/* 수학 점수 내림차순, 버블 정렬 */
		for (int i=studentArr.length-1; i>0; i--) {
			for (int j=studentArr.length-1; j>studentArr.length-1-i; j--) {
				if (studentArr[j].getKor()==studentArr[j-1].getKor() && studentArr[j].getEng()==studentArr[j-1].getEng()) {
					if (studentArr[j].getMat()>studentArr[j-1].getMat()) {
						Student tmp = studentArr[j];
						studentArr[j] = studentArr[j-1];
						studentArr[j-1] = tmp;
					}
				}
			}
		}
		
		/* 이름 사전순(오름차순), 버블 정렬 */
		for (int i=0; i<studentArr.length-1; i++) {
			for (int j=0; j<studentArr.length-1-i; j++) {
				for (int k=0; k<(studentArr[j].getName().length()<studentArr[j+1].getName().length()?studentArr[j].getName().length():studentArr[j+1].getName().length()); k++) {
					if (studentArr[j].getKor()==studentArr[j+1].getKor() && studentArr[j].getEng()==studentArr[j+1].getEng() && studentArr[j].getMat()==studentArr[j+1].getMat()) {
						if (studentArr[j].getName().charAt(k)<studentArr[j+1].getName().charAt(k)) {
							break;
						} else if (studentArr[j].getName().charAt(k)>studentArr[j+1].getName().charAt(k)) {
							Student tmp = studentArr[j];
							studentArr[j] = studentArr[j+1];
							studentArr[j+1] = tmp;
							break;
						} else if (k==(studentArr[j].getName().length()>studentArr[j+1].getName().length()?studentArr[j].getName().length():studentArr[j+1].getName().length()) && studentArr[j].getName().length()>studentArr[j+1].getName().length()) {
							Student tmp = studentArr[j];
							studentArr[j] = studentArr[j+1];
							studentArr[j+1] = tmp;
						}
					}
				}
			}
		}
		
		return studentArr;
	}
	
}