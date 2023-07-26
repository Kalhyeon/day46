package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.sample.Example;

// com.example.demo.sample.Example 클래스의 객체는
// 스프링이 관리하고 있다.

@SpringBootTest
public class ExampleTest {
//  스프링에게 객체를 요청 : DI
  @Autowired
  Example ob;
  
//  아래 메서드 (test1)는 jUnit 으로 실행하겠다.
  @Test
  public void test1() {
    System.out.println(ob.hashCode());
  }
}
