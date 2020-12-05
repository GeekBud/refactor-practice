package handleGeneralRelations.encapsulateCollection.before;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class CourseTest {

    @Test
    public void before() {
        // 为kent添加课程
        Person kent = new Person();
        Set s = new HashSet<>();
        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        kent.setCourses(s);
        Assert.assertEquals(2, kent.getCourses().size());

        // 集合封装性测试
        encapsulationTest(kent,s);

        // 再次为kent添加课程
        Course refact = new Course("Refactoring", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("Brutal Sarcasm", false));
        Assert.assertEquals(4, kent.getCourses().size());
        kent.getCourses().remove(refact);
        Assert.assertEquals(3, kent.getCourses().size());

        // 了解kent的高级课程数量
        Iterator iter = kent.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = (Course) iter.next();
            if (each.isAdvanced()) count++;
        }

    }

    @Test
    public void after() {
        // 为kent添加课程
        handleGeneralRelations.encapsulateCollection.after.Person kent = new  handleGeneralRelations.encapsulateCollection.after.Person();
        kent.addCourse(new handleGeneralRelations.encapsulateCollection.after.Course("Smalltalk Programming", false));
        kent.addCourse(new handleGeneralRelations.encapsulateCollection.after.Course("Appreciating Single Malts", true));
        Assert.assertEquals(2, kent.getCourses().size());

        // 再次为kent添加课程
        handleGeneralRelations.encapsulateCollection.after.Course refact = new handleGeneralRelations.encapsulateCollection.after.Course("Refactoring", true);
        kent.addCourse(refact);
        kent.addCourse(new handleGeneralRelations.encapsulateCollection.after.Course("Brutal Sarcasm", false));
        Assert.assertEquals(4, kent.getCourses().size());
        kent.removeCourse(refact);
        Assert.assertEquals(3, kent.getCourses().size());

        // 了解kent的高级课程数量
        kent.numberOfAdvancedCourses();

    }

    /**
     * 理想情况：当集合已经被set进person后，将失去对person内部集合的控制能力，保证封装性
     * */
    public void encapsulationTest(Person person,Set set){
        int numberBefore = person.getCourses().size();
        set.add(new Course("collection test",false));
        int numberAfter = person.getCourses().size();
        Assert.assertEquals(numberBefore,numberAfter);
    }

}