package cn.itcast.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 点击超链接，一会让该类中的这个方法执行，
 *
 * 想让一个类的方法执行，必须把这个类变成对象-- ioc 把类交给容器去管理
 */
// 控制器类
@Controller
//@RequestMapping(path = "/user")
public class HelloController {
    /***
    用于建立请求URL和处理请求方法之间的对应关系

     可以放到方法上，类上
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET,params = {"username=heihei"},headers = "Accept")
//    @RequestMapping("/hello")
//    @RequestMapping(value = "/hello")
//    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }


}
