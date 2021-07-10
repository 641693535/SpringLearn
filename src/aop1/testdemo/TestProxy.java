package aop1.testdemo;

import aop1.proxytest.Animal;
import aop1.proxytest.Dog;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 10:56
 */
public class TestProxy {

    @Test
    public void test1(){

        Dog dog = new Dog();

        Object o = Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), new Impinvocation(dog));
        if (o instanceof Animal) {
            Animal d = (Animal) o;
            d.eat();
            d.sleep();
        }
    }

}
class Impinvocation implements InvocationHandler {

    private Object obj;

    public Impinvocation(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}