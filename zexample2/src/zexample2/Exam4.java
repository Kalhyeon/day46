package zexample2;

// 부모 클래스가 구체적인 동작을 정해주면 확장성이 떨어진다
// => OverRide

class Vehicle4 {
  public void run() {
    System.out.println("달려갑니다.");
  }
}

class Bus4 extends Vehicle4 {
  @Override
  public void run() {
    System.out.println("버스를 타고 달려갑니다.");
  }
}

class Airplane4 extends Vehicle4 {
  @Override
  public void run() {
    System.out.println("비행기를 타고 날아갑니다.");
  }
}

public class Exam4 {
  public static void main(String[] args) {
//    상속에 의해 run 메서드를 2개 가진다 : this.run(), super.run()
//    참조 변수의 타입이 부모이므로 super.run() 이 호출되는데,
//    자바가 this.run() 을 눈치채고 결과적으로 this.run() 이 호출된다.
    Vehicle4 ob = new Airplane4();
    ob.run();
  }
}
