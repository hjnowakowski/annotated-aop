package info.henryk.aop;

import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


/**
 * Created by henryknowakowski on 15.07.2017.
 */

@Aspect //if aspect is aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    //("execution(* *(..))") means: methods that return anything, are anywhere and arg number is undefined

    //in order not to repeat "("execution(* *(..))")" we can use pointcut as following:
    @Pointcut("execution(* *(..))")
    public void allMethods() {}
    

    @Before("allMethods()") //for which methods the advice should work
    public void logBefore(JoinPoint joinPoint){
        logger.info("Executing method " + joinPoint.getSignature().getName());
    }

    @After("execution(* *(..))") // ("allMethods()") can be used here //(("execution(* *(..))")) by default means  (value = ("execution(* *(..))"))
    public void logAfter(JoinPoint joinPoint){
        logger.info("After method " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "allMethods()", returning = "returnedValue")
    public void logAfterReturning(Object returnedValue){
        logger.info("Returned value: " + returnedValue);
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "exception")  //after throwing exception
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception){
        logger.info("Method " + joinPoint.getSignature().getName() + "has thrown" + exception);
    }

    public void logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        proceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();
        logger.info("Execution time: " + (end - start) + " ms");
    }
}
