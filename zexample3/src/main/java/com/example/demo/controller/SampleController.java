package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 어노테이션은 가짜 클래스 : 부모와 자식이 성립
// @Component 의 자식 어노테이션

@Controller
public class SampleController {
  @GetMapping("/input1")
  public String input1() {
//    Get 은 화면을 보여준다 (forward)
    return "input1"; // 파일명
  }
  
  @PostMapping("input1")
  public String input1(@RequestParam Integer value, Model model) {
    model.addAttribute("value", value);
//    Post 는 작업을 수행 후 이동
//    => 예제니까 forward 로 결과를 보여주도록 한다.
    return "result1";
  }
  
  @GetMapping("/input2")
  public String input2() {
    return "input2";
  }
  
  @PostMapping("/input2")
  public String input2(@RequestParam Integer value, Model model) {
    Integer result = value * value;
    model.addAttribute("value", result);
    return "result2";
  }
}
