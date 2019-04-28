package cn.yeshaoting.demo.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        throw new RuntimeException("发生错误");
//        return "Hello World";
    }

}