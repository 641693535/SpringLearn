package aop1.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 10:50
 */
@Component
public class User {

    public void add(){
        System.out.println("add......");
    }

}
