package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // key, value 형식
        model.addAttribute("data", "spring!!");
        /**
         * 컨트롤러에서 문자로 return 시, `viewResolver`가 화면을 찾아서 처리
         * 스프링부트 템플릿 엔진 기본 viewName 매핑
         * `resources:templates/` + {viewName} + `.html` 형식
         * */
        return "hello";
    }

}
