package JavaStudy01;

/*
 인터페이스
 개발 코드와 객체가 서로 통신하는 접점
 (개발 코드는 인터페이스의 메서드만 알고 있으면 활용 가능)
 추상클래스의 발전된 형태
 
 인터페이스의 역할
 개발 코드가 객체에 종속되지 않도록 하며 객체를 교환하거나 대체할 수 있도록 하는 역할
 개발 코드 변경 없이 리턴값 또는 실행 내용이 다양해질 수 있도록 해줌 (다형성)
 
 
 다중 상속의 문제점
 - 다중 상속 시 명칭이 중복되는 이슈 등 큰 문제점이 발생한다
 Java는 단일 상속만 가능하다
 다중 상속의 제한을 극복하기 위해 가져온 대안이 인터페이스이다!
 -> 사용 방법 제공(추상 클래스) + 다형성
    (다형성에 의해 사용 방식을 규격화한다!)
 
 인터페이스의 구성 요소
 - 모두 추상 메서드!
 - 자체 객체 생성이 불가능! 변수 생성은 가능!
   (즉, 자식 클래스가 상속을 받아 기능을 구현해야한다!)
 - 인터페이스는 상수 필드만 선언 가능!!
   즉 static final 형태
   상수명은 대문자로 작성하며 선언과 동시에 초기값을 지정해야한다  
 
 
 인터페이스 구성 멤버
 - 추상 메서드
 - 정적 멤버(정적 필드, 메서드)
 - default 메서드
 
 인터페이스 선언
 [접근제한자] interface 인터페이스명 {}
 ex> 
 [public] interface 인터페이스명 {
 }
 
 추상 메서드 선언
 인터페이스를 통해 호출된 메서드는 최종적으로 객체에서 실행 (추상 메서드는 코드 블록이 없으므로!)
 public abstract를 생략하더라도 자동적으로 컴파일 과정에서 붙는다!
 */

public class Java34 {

	public static void main(String[] args) {
		Java34_2 tv = new Java34_2();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();

	}

}