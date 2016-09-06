package beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by 佳琦 on 2016/4/18.
 */
public class ActionListener implements ApplicationListener{
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ActionEvent){
            System.out.println(applicationEvent.toString());
        }
    }
}
