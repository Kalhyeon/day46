package zexample2;

class Vehicle1 {
  
}

class Bus1 extends Vehicle1 {
  public void run() {
    System.out.println("달려갑니다.");
  }
}

class Taxi1 extends Vehicle1 {
  public void go() {
    System.out.println("달려갑니다.");
  }
}

public class Exam1 {
  public static void main(String[] args) {
//    참조 변수는 항상 부모, 실제로 사용하는 객체는 항상 자식
    Vehicle1 ob = new Bus1();
    
//    그런데 부모의 참조 변수의 자식의 독자적인 메서드에만 접근이 불가능하다.
//    ob.run(); => 에러
  }
}
