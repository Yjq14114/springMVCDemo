package beans;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 佳琦 on 2016/4/18.
 */
public class ActionEvent extends ApplicationEvent{
    public ActionEvent(Object source) {
        super(source);
    }
}
