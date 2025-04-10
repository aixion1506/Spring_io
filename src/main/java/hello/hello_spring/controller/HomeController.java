package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Controller를 이용한 화면이 일반 정적 컨텐츠 보다 우선권을 갖음
    @GetMapping("/")
    public String home() {
        return "home";
    }


}
