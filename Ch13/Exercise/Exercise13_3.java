/* Exercise 13-3. 다음 중 스레드를 일시정지 상태(WAITING)로 만드는 것이 아닌 것은?
 * (모두 고르시오)
 *
 * [보기]
 * a. suspend()
 * b. resume()
 * c. join()
 * d. sleep()
 * e. wait()
 * f. notify()
 *
 * [정답] b, f
 * b. resume() 는 suspend() 로 일시정지 상태(WAITING)인 스레드를 실행 가능한 상태(RUNNABLE) 로 변경
 * f. notify() WAITING POOL 에서 기다리던 일시정지 상태(WAITING)인 스레드를 실행 가능한 상태(RUNNABLE) 로 변경
 *
 * [해설]
 * a. RUNNABLE -> WAITING
 * b. WAITING -> RUNNABLE
 * c. RUNNABLE -> WAITING
 * d. RUNNABLE -> WAITING
 * e. RUNNABLE -> WAITING
 * f. WAITING -> RUNNABLE
 */