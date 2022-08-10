package example1;

/*
2. ShiftSupervisor Class
In a particular factory, a shift supervisor is a salaried employee who supervises a shift.
In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets production goals.
Design a ShiftSupervisor class that extends the Employee class you created in
Programming Challenge 1. The ShiftSupervisor class should have a field that holds the
annual salary and a field that holds the annual production bonus that a shift supervisor has
earned. Write one or more constructors and the appropriate accessor and mutator methods
for the class. Demonstrate the class by writing a program that uses a ShiftSupervisor object.
 */
public class shiftSupervisor extends employee{
    private double annualSalary;
    private double annualProductionBonus;

    public shiftSupervisor(double annualSalary, double annualShiftBonus){
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualShiftBonus;
    }

    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    public void setAnnualShiftBonus(double annualShiftBonus){
        this.annualProductionBonus = annualShiftBonus;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public double getAnnualShiftBonus(){
        return annualProductionBonus;
    }
}
