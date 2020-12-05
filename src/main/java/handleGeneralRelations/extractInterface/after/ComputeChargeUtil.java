package handleGeneralRelations.extractInterface.after;

public class ComputeChargeUtil {

    private ComputeChargeUtil(){}

    public static double charge(Billable emp, int days) {
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill()) {
            return base * 1.05;
        } else return base;
    }



    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(charge(emp, 5));
    }


}
