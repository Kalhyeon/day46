package zexample2;

// 부모 클래스는 자식들이 구현할 메서드의 이름을 정해준다
// => 오버라이드할 메서드는 추상 메서드

abstract class Vehicle6 {
//  추상 메서드를 가지는 클래스는 반드시 abstract 키워드가 필요하다.
  abstract public void run();
}

class Bus6 extends Vehicle6 {
//  Bus6 은 run() 을 상속 => 추상 클래스가 된다.
//  추상 메서드의 역할 : 에러를 발생시켜
//                 자식 클래스에게 구현할 메서드를 알려준다.
  @Override
  public void run() {
    
  }
}

class Airplane6 extends Vehicle6 {
  @Override
  public void run() {
    
  }
}

public class Exam6 {
  public static void main(String[] args) {
    
  }
}
