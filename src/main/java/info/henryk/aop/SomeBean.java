package info.henryk.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeBean implements SomeBeanInterface { //creates SomeBean bean by deafoult class name
    public void method1(){
        this.method2(); //spring wont use here

    }
    public void method2(){

    }
}
