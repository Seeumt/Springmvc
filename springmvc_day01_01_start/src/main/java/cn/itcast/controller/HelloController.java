package cn.itcast.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 点击超链接，一会让该类中的这个方法执行，
 *
 * 想让一个类的方法执行，必须把这个类变成对象-- ioc 把类交给容器去管理
 */
// 控制器类
@Controller
public class HelloController {
//请求映射
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }


}
