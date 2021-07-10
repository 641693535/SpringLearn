package aop1.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 10:51
 */
@Component
@Aspect
@Order(3)//切入点优先级
public class UserProxy {

    //公共切入点
    @Pointcut(value = "execution(* aop1.aopanno.*.add())")
    public void pointdemo(){
    }

    @Before("pointdemo()")
    public void before(){
        System.out.println("before......");
    }

    @After(value = "execution(* aop1.aopanno.*.*())")
    public void after(){
        System.out.println("after......");
    }

    @AfterReturning(value = "execution(* aop1.aopanno.*.*(..))")
    public void afterReturning(){
        System.out.println("afterReturning.......");
    }

    @AfterThrowing("execution(* aop1.aopanno.*.*(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }

    @Around("execution(* aop1.aopanno.*.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("aroundBegin......");

        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("aroundAfter......");
    }

}
