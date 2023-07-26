package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.test.Test2;

@SpringBootTest
public class Test2_1 {
  @Autowired
  Test2 t2;
  
  @Test
  public void test2() {
    t2.hello();
  }
}
