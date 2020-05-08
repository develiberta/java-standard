/* Exercise 8-4. 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
 * void method() throws InvalidNumberException, NotANumberException {}
 *
 * class NumberException extends RuntimeException {}
 * class InvalidNumberException extends NumberException {}
 * class NotANumberException extends NumberException {}
 *
 * [보기]
 * a. try {method();} catch(Exception e) {}
 * b. try {method();} catch(NumberException e) {} catch(Exception e) {}
 * c. try {method();} catch(Exception e) {} catch(NumberException e) {}
 * d. try {method();} catch(InvalidNumberException e) {} catch(NotANumberException e) {}
 * e. try {method();} catch(NumberException e) {}
 * f. try {method();} catch(RuntimeException e) {}
 *
 * [정답] c
 * try 블록 안에서 예외 발생 시 해당 예외클래스의 인스턴스가 만들어지고,
 * catch 괄호의 클래스에 대해 instanceof로 검사해서 true인 경우 catch 블록을 수행한 후 전체 catch 블록을 빠져나간다.
 * 그러므로 세부 Exception 에 대한 catch 블록을 작성 후 Exception 에 대한 catch 블록을 작성해야 하며,
 * 그렇지 않을 경우 컴파일 에러가 발생한다.
 */