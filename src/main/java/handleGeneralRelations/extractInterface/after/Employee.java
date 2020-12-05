package handleGeneralRelations.extractInterface.after;

public class Employee implements Billable{

    private int rate;

    private boolean hasSpecialSkill;

    /**
     * something else ...
     */


    public int getRate() {
        return rate;
    }

    public boolean hasSpecialSkill() {
        return hasSpecialSkill;
    }

    public double charge(Billable emp, int days) {
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill()) {
            return base * 1.05;
        } else return base;
    }

}
