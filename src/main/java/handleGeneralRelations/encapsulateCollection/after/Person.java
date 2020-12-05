package handleGeneralRelations.encapsulateCollection.after;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 上课dei人
 * */
public class Person {

    private Set courses = new HashSet();

    // 添加集合操作方式（使用集合方式将更加简洁，不再需要get-操作）
    public void addCourse(Course course){
        courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    // 限制集合get/set method

    // 返回只读集合，以确保对集合的操作都使用新的方式进行
    public Set getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    // rename-method：setCourses -> initializeCourses
    // 添加副本：Course为引用类型，在添加后在外部仍存在对该地址的引用，导致该集合可被外部直接修改，影响封装性
    public void initializeCourses(Set courses) {
        assert courses.isEmpty();  // 集合初始化时应为空
        this.courses.addAll(courses);
    }

    // 对于使用lombok，无法消除setCourses入口的情况，内部调用initializeCourses
    public void setCourses(Set courses){
        this.initializeCourses(courses);
    }

    // extract-method -> move-method
    public Integer numberOfAdvancedCourses(){
        return courses.size();
    }


}
