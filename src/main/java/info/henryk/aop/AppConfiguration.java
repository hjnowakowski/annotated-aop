package info.henryk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by henryknowakowski on 15.07.2017.
 */
@Configuration
@ComponentScan("info.henryk.aop")
@EnableAspectJAutoProxy
public class AppConfiguration {

}

