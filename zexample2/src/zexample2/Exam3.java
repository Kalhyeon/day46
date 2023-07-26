package zexample2;

// 부모 클래스는 확장성이 있어야 한다.

class Vehicle3 {
  public void run() {
    System.out.println("달려갑니다.");
  }
}

class Bus3 extends Vehicle3 {

}

class Taxi3 extends Vehicle3 {

}

class Airplane3 extends Vehicle3 {
  
}

public class Exam3 {
  public static void main(String[] args) {
    Vehicle3 ob = new Airplane3();
    ob.run();
  }
}
