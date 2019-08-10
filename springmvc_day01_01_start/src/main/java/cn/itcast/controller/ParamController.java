package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

@Controller
@RequestMapping("/param")
public class ParamController {


    @RequestMapping("/testParam")
//    @RequestMapping(value = "/testParam",params = {"username=hehe"})
    public String testParam(String username,String password) {
        System.out.println("执行了哟！");
        System.out.println("欢迎"+username);
        System.out.println("欢迎"+password);
        return "success";
    }


    @RequestMapping(value = "/saveAccount",method = {RequestMethod.POST})
//    @RequestMapping(value = "/testParam",params = {"username=hehe"})
    public String  saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping(value = "/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }


    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(request.getSession());
        request.getSession().getServletContext();
        return "success";
    }
}
