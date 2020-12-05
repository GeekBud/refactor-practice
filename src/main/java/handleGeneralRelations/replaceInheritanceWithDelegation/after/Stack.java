package handleGeneralRelations.replaceInheritanceWithDelegation.after;

/**
 * 子类
 * */
public class Stack {

    private Vector vector = new Vector();

    public String imSuperMethod(){
        return vector.imSuperMethod();
    }

}
