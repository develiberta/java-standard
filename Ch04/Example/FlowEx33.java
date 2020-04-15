class FlowEx33 {
	public static void main(String[] args) {
		// for문에 Loop1이라는 이름을 붙임
		Loop1: for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
				// 이하 4개의 코드 중 한 줄만 남기고 주석처리해서 결과 추측 및 확인하기
					break Loop1;	// Loop1을 벗어나므로 더이상 출력되지 않음 (2*4까지 출력)	
//					break;			// 가장 가까운 반복문을 벗어나므로 2단, 3단, ... 계속 출력됨 (각*4까지 출력) 
//					continue Loop1;	// Loop1의 끝으로 이동하므로 2단, 3단, ... 계속 출력됨 (각*4까지 출력)
//					continue;		// 가장 가까운 반복의 끝으로 이동하므로 *5 부분만 생략되고 나머지는 모두 출력
				System.out.println(i + "*" + j + "=" + i*j);
			}	// end of for i
			System.out.println();
		}	// end of Loop1
	}
}