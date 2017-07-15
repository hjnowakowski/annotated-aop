package info.henryk.aop;

import org.springframework.stereotype.Component;

/**
 * Created by henryknowakowski on 15.07.2017.
 */

@Component
public class SomeBean { //creates SomeBean bean by deafoult
    public String SomeMethod(){
        return "Some value";
    }
}
