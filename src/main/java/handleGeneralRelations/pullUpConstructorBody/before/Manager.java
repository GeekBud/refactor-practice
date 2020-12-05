package handleGeneralRelations.pullUpConstructorBody.before;

public class Manager extends Employee {

    private int _grade;

    public Manager(String _name, String _id, int _grade) {
//        this._name = _name;
//        this._id = _id;
        super(_name, _id);
        this._grade = _grade;
        if (isPriviliged())
            assignCar();  // every subclass does this
    }

    public boolean isPriviliged() {
        return _grade > 4;
    }

    // 该方调用时机依赖子类_grade，法不能直接使用pull-up-method，
    public void assignCar(){

    }
}
