/* Exercise 9-3. 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
 */
class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		int sep = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0,sep);
		fileName = fullPath.substring(sep+1);
		
		System.out.println("fullPath : " + fullPath);
		System.out.println("path : " + path);
		System.out.println("fileName : " + fileName);
	}
}