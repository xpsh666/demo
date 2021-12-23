package cn.jx.xpsh.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @RequestMapping("/index")
    public String demo(){
        return "ok";
    }
}
