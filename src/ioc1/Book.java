package ioc1;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-21 20:01
 */
public class Book {

    private String bname;
    private double bprice;
    private String address;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bprice=" + bprice +
                ", address='" + address + '\'' +
                '}';
    }
}
