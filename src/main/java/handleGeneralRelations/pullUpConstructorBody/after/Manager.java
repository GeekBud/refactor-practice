package handleGeneralRelations.pullUpConstructorBody.after;

public class Manager extends Employee {

    private int _grade;

    public Manager(String _name, String _id, int _grade) {
        super(_name, _id);
        this._grade = _grade;
        super.init();
    }

    @Override
    public boolean isPriviliged() {
        return _grade > 4;
    }

    @Override
    public void assignCar(){

    }
}
