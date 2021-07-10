package ioc2.factorybean;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-26 20:14
 */
public class Orders {

    private String phone;

    public Orders() {
        System.out.println("第一步，通过构造器创建实例.");
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("第二步，通过Set给属性赋值.");
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化方法.");
    }

    public void destoryMethod(){
        System.out.println("第五步，执行销毁方法.");
    }


}
