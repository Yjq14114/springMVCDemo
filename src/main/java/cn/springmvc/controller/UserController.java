package cn.springmvc.controller;

import cn.springmvc.model.User;
import cn.springmvc.service.impl.IUserService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@Controller
@RequestMapping("/user")
public class UserController{
    private static Logger logger = Logger.getLogger(UserController.class);
    private static HttpServletRequest request = null;
    private  HttpServletResponse response = null;

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/getPerson", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public void getPerson(String name,HttpServletResponse response) throws Exception{
        response.setHeader("Cache-Control", "no-cache");
        response.setContentType(null);
        response.setCharacterEncoding("UTF-8");
        PrintWriter pw = response.getWriter();
        pw.write("{success:true,msg:'测试成功'}");
        pw.close();
    }
    @RequestMapping("/name")
    public String sayHello(){
        return "name";
    }
    @RequestMapping("/model")
    @ResponseBody
    public ModelAndView modelPage(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("key","value");
        map.put("hello","你好");
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("map",map);
        return new ModelAndView("register",modelMap);
    }
    @RequestMapping("/json")
    @ResponseBody
    public String jsonPage(HttpServletRequest request) throws Exception{
        String str = "{success:true,msg:'你好'}";
//        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());

        return str;
    }
    @RequestMapping("/check")
    @ResponseBody
    public String check(String username) throws Exception{
        List<User> userList = userService.getUserByName(username);
        if (userList.size()==0)
            return "0";
        else
            return userList.get(0).getUsername();
    }
}
