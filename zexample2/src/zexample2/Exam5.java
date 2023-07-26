package zexample2;

// 추상 메서드와 추상 클래스
// 부모 클래스의 메서드는 실제로 실행되는 것이 아닌 메서드의 이름을 정해준다.
// - 부모 클래스의 메서드는 구체적일 필요가 없다.
// - 자식을 만드는 개발자에게 OverRide 해야 한다는 사실을 알려주자.

// 추상 메서드 : 중괄호 ({}) 를 가지지 않는 메서드
//            => 미완성 메서드 (구현하지 않는 메서드)
// 추상 클래스 : 추상 메서드를 가지는 클래스 => 객체 생성 불가

abstract class Vehicle5 {
//  추상 메서드
  public abstract void run();
  
//  구상 (concrete) 메서드
  public void go() {
    
  }
  
}

public class Exam5 {
  public static void main(String[] args) {
//    Vehicle5 ob = new Vehicle5(); => 에러
  }
}
