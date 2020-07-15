/* Exercise 9-13. 다음은 하나의 긴 문자열(source) 중에서 특정 문자열과 일치하는 문자열의 개수를 구하는 예제이다.
 * 빈 곳을 채워 예제를 완성하시오.
 */
public class Exercise9_13 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key==null || key.length()==0)
			return 0;
		
		/* (1) 알맞은 코드를 넣어 완성하시오. */
		index = pos;
		
		while(index<src.length()) {
			if(src.substring(index).contains(key)) {
				count++;
				index += src.substring(index).indexOf(key) + key.length();
			}
		}
		
		/* 해설 답안 */
//		while((index=src.indexOf(key,pos)) != -1) {
//			count++;
//			pos = index + key.length();
//		}
		
		return count;
	}
}