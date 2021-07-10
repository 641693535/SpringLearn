package ioc2.factorybean;

import ioc2.collectiontype.Water;
import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-25 20:19
 */
public class MyBean implements FactoryBean<Water> {


    @Override
    public Water getObject() throws Exception {
        Water water = new Water();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("农夫山泉");
        strings.add("怡宝");
        water.setwName(strings);
        return water;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
