package ioc3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-28 13:45
 */
@Configuration//声明为注解配置类
@ComponentScan(value = {"ioc3"})//组件扫描
public class SpringConfig {

}
