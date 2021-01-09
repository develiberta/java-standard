/* Exercise 13-4. 다음 중 interrupt()에 의해서 실행대기 상태(RUNNABLE)가 되지 않는 경우는?
 * (모두 고르시오)
 *
 * [보기]
 * a. sleep()에 의해서 일시정지 상태인 스레드
 * b. join()에 의해서 일시정지 상태인 스레드
 * c. wait()에 의해서 일시정지 상태인 스레드
 * d. suspend()에 의해서 일시정지 상태인 스레드
 *
 * [정답] c(틀림), d
 * c. notify() 또는 notifyAll() 에 의해 실행대기 상태(RUNNABLE)가 됨
 * d. resume() 에 의해 실행대기 상태(RUNNABLE)가 됨
 *
 * [해설] d
 * suspend() 를 제외한 나머지 메서드들은 interrupt() 가 호출되면 InterruptedException 이 발생해서
 * 일시정지 상태에서 벗어나 실행대기 상태가 된다. (try-catch 문으로 InterruptedException 을 처리해주어야 한다.)
 */