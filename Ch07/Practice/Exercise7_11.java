/* Exercise 7-11. 문제 7-10에서 작성한  MyTv2클래스에
 * 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가해서
 * 실행결과와 같은 결과를 얻도록 하시오.
 * [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
 * 메서드명	: gotoPrevChannel
 * 기능		: 현재 채널을 이전 채널로 변경한다.
 * 반환타입	: 없음
 * 매개변수	: 없음
 * [실행결과]
 * CH:10
 * CH:20
 * CH:10
 * CH:20
 */
class Exercise7_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}
}
 
class MyTv2 {
	private boolean	isPowerOn;
	private int 	channel;
	private int		volume;
	
	final int MAX_VOLUME	= 100;
	final int MIN_VOLUME	= 0;
	final int MAX_CHANNEL	= 100;
	final int MIN_CHANNEL	= 1;
	
	private int		prevChannel;				// 새로운 멤버변수 정의
	
	/* 문제 7-10의 답 (문제에선 생략함) */
	public boolean getIsPowerOn() {
		return this.isPowerOn;
	}
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return this.channel;
	}
	public void setChannel(int channel) {
		if(1<=channel && channel<=100) {
			this.prevChannel = this.channel;	// 새롭게 추가된 기능
			this.channel = channel;
		} else {
			System.out.println("1과 100 사이의 채널을 입력해주세요.");
		}
	}
	public int getVolume() {
		return this.volume;
	}
	public void setVolume(int volume) {
		if(0<=volume && volume<=100) {
			this.volume = volume;
		} else {
			System.out.println("0과 100 사이의 볼륨을 입력해주세요.");
		}
	}
	
	/* (1) 문제 7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오. */
	public void gotoPrevChannel() {
		// 현재 채널과 이전 채널의 값을 교환
		int tmp = 0;
		tmp = this.channel;
		this.channel = this.prevChannel;
		this.prevChannel = tmp;
	}
	
}