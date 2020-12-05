package handleGeneralRelations.pullUpConstructorBody.after;

public abstract class Employee {

    protected String _name;
    protected String _id;

    abstract boolean isPriviliged();
    abstract void assignCar();

    protected Employee(String _name, String _id) {
        this._name = _name;
        this._id = _id;
    }

    public void init(){
        if (isPriviliged())
            assignCar();  // every subclass does this
    }

}
