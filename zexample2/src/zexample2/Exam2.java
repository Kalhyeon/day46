package zexample2;

// 자바의 모든 클래스의 부모 - Object
// Object 의 참조 변수는 모든 자바의 객체를 가리킬 수 있다.
// Vehicle2 대신에 Object 를 사용하면 => 너무 광범위하여
//                                 참조 변수를 사용하지는 않는다.

class Vehicle2 extends Object{
  public void run() {
    System.out.println("달려갑니다.");
  }
}

class Bus2 extends Vehicle2 {

}

class Taxi2 extends Vehicle2 {

}

public class Exam2 {
  public static void main(String[] args) {
    Vehicle2 ob = new Bus2();
    ob.run();
  }
}
