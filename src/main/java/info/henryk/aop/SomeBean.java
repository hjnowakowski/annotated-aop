package info.henryk.aop;

import org.springframework.stereotype.Component;

/**
 * Created by henryknowakowski on 15.07.2017.
 */

@Component
public class SomeBean implements SomeBeanInterface { //creates SomeBean bean by deafoult class name
    public void method1(){
        this.method2();

    }
    public void method2(){

    }
}
