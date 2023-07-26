package zexample2;

// 서블릿 인터페이스는 메서드의 이름을 규정한다.
// 서블릿이 태어나고 (init), 운영되고 (service), 죽는다 (destroy)
// => 생명 주기 (LifeCycle)
interface Servlet {
  public void init();
  public void service();
  public void destroy();
}

// 표준을 기본 구현한 클래스 : 자바에서는 Adapter 클래스
class HttpServlet implements Servlet {
  public void init() {}
  public void service() {}
  public void destroy() {}
}

class MyServlet extends HttpServlet {
  
}

public class Exam8 {

}
