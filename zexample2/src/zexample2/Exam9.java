package zexample2;

interface Remotecontroller {
  
}

class SamsungRemotecontroller implements Remotecontroller {
  
}

class LGRemotecontroller implements Remotecontroller {
  
}

public class Exam9 {
  public static void main(String[] args) {
    Remotecontroller rm = new SamsungRemotecontroller();
    
//    단일 상속 : 하나의 부모만 허용한다.
//    다중 상속 : 여러 부모를 허용한다.
    
//    자바에서 extends 는 단일 상속,
//    implements 는 다중 상속이다.
  }
}
