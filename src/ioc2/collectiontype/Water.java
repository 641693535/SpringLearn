package ioc2.collectiontype;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-25 19:48
 */
public class Water {

    private List<String> wName;

    public void setwName(List<String> wName) {
        this.wName = wName;
    }

    @Override
    public String toString() {
        return "Water{" +
                "wName=" + wName +
                '}';
    }
}
