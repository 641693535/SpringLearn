package ioc2.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-22 18:21
 */
public class Stu {

    //数组类型属性
    private String[] courses;

    //list集合类型的属性
    private List<String> list;

    //set集合类型的属性
    private Set<String> sets;

    //Map类型属性
    private Map<String, Double> score;

    //对象数组
    private List<Courdw> courdwsList;

    public void setCourdwsList(List<Courdw> courdwsList) {
        this.courdwsList = courdwsList;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", sets=" + sets +
                ", score=" + score +
                ", courdwsList=" + courdwsList +
                '}';
    }
}
