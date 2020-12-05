package handleGeneralRelations.encapsulateCollection.after;

/**
 * 课程类
 * */
public class Course {

    private String name;  // 名称
    private boolean isAdvanced;  // 是否为高级课程

    public Course(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }

}
