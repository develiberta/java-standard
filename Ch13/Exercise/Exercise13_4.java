/* Exercise 13-4. 다음 중 interrupt()에 의해서 실행대기 상태(RUNNABLE)가 되지 않는 경우는?
 * (모두 고르시오)
 *
 * [보기]
 * a. sleep()에 의해서 일시정지 상태인 스레드
 * b. join()에 의해서 일시정지 상태인 스레드
 * c. wait()에 의해서 일시정지 상태인 스레드
 * d. suspend()에 의해서 일시정지 상태인 스레드
 *
 * [정답] c, d
 * c. notify() 또는 notifyAll() 에 의해 실행대기 상태(RUNNABLE)가 됨
 * d. resume() 에 의해 실행대기 상태(RUNNABLE)가 됨
 */