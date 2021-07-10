package aop1.proxytest;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 10:56
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eat......");
    }

    @Override
    public void sleep() {

        System.out.println("Dog sleep......");

    }
}
