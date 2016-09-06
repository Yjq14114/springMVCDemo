package action;

import beans.LoginAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by ���� on 2016/4/11.
 */
public class TestBean{
    /**
     * the Test-code also referred Customer-code
     */
    @Test
    public void testQuickStart(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/test/res/bean.xml");
        Action action = (Action)ctx.getBean("TheAction");
        System.out.println(action.execute(" Michal Jackson"));
    }
    @Test
    public void testFactory(){
        Action action = ActionFactory.getAction("TheAction");
        System.out.println(action.execute("BillieJean"));
        System.out.println("");
    }
    @Test
    public void testIternation() throws IOException {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:bean1.xml");
        Object[] arg = new Object[]{"Erica", Calendar.getInstance().getTime()};
//以系统默认Locale加载信息(对于中文WinXP而言，默认为zh_CN)
        String msg = ctx.getMessage("userinfo",arg, Locale.CHINESE);
        System.out.println("Message is ===> "+msg);
        Resource rs = ctx.getResource("classpath:config.properties");
        File file = rs.getFile();
    }
    @Test
    public void testLogin(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:bean.xml");
        LoginAction login = (LoginAction)ctx.getBean("loginaction");
        login.login("yjq","14114");
    }

}
