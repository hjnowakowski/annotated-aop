package info.henryk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan("info.henryk.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true) //when we implement method
public class AppConfiguration {

}

