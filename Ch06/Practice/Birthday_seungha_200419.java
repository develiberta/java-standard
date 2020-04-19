import java.util.Scanner;

public class Birthday_seungha_200419 {

		public static void main(String[] args) {
			
		/* 입력부 */
		Scanner scanner  = new Scanner(System.in);
		int count = scanner.nextInt();
		Student[] arrStudent = new Student[count];
		for  (int i=0; i<count; i++) {
			String name = scanner.next();
			int day = scanner.nextInt();
			int month = scanner.nextInt();
			int year = scanner.nextInt();
			arrStudent[i] = new Student(name, day, month, year);
		}
		
		/* 출력부 */
		System.out.println(Student.older(arrStudent).name);
		System.out.println(Student.younger(arrStudent).name);
	}
}


class Student {
	String name;
	int day;
	int month;
	int year;
	
	Student() { }
	
	Student(String name, int day, int month, int year) {
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	static Student older(Student[] arrStudent) {
		Student older = arrStudent[0];
		for (int i=1; i<arrStudent.length; i++) {
			if (older.year < arrStudent[i].year) {
				older = arrStudent[i];
			} else if (older.year == arrStudent[i].year && older.month < arrStudent[i].month) {
				older = arrStudent[i];
			} else if (older.year == arrStudent[i].year && older.month == arrStudent[i].month && older.day < arrStudent[i].day) {
				older = arrStudent[i];
			}
		}
 		return older;
	}
	
	static Student younger(Student[] arrStudent) {
		Student younger = arrStudent[0];
		for (int i=1; i<arrStudent.length; i++) {
			if (younger.year > arrStudent[i].year) {
				younger = arrStudent[i];
			} else if (younger.year == arrStudent[i].year && younger.month > arrStudent[i].month) {
				younger = arrStudent[i];
			} else if (younger.year == arrStudent[i].year && younger.month == arrStudent[i].month && younger.day > arrStudent[i].day) {
				younger = arrStudent[i];
			}
		}
 		return younger;
	}
}
