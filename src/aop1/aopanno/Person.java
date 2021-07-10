package aop1.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 14:39
 */

@Component
@Aspect
@Order(1)//优先级
public class Person {
    @Before(value = "execution(* aop1.aopanno.*.add())")
    public void before(){
        System.out.println("Person before......");
    }

}
