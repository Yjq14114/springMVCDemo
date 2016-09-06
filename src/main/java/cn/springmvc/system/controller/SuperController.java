package cn.springmvc.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 */
@Controller
public class SuperController {
    private  HttpServletRequest request = null;
    private HttpServletResponse response = null;


    /**
     * html/xml-formatted string exproted into front desk
     * @param string
     * @param contentType
     * @throws Exception
     */
    @ResponseBody
    public void printString(String string,String contentType)throws Exception{
        response.setHeader("Cache-Control","no-cache");
        response.setContentType(contentType);
        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write(string);
        printWriter.close();
    }
}
