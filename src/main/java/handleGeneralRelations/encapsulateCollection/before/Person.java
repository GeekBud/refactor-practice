package handleGeneralRelations.encapsulateCollection.before;

import java.util.Set;

public class Person {

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }

    private Set courses;



}
