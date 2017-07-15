package info.henryk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by henryknowakowski on 15.07.2017.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        someBean.SomeMethod();
    }
}
